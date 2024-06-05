package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.InsertCreditCard: ImageVector
    get() {
        if (_insertCreditCard != null) {
            return _insertCreditCard!!
        }
        _insertCreditCard = Builder(name = "InsertCreditCard", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 17.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(21.0f, 8.724f)
                verticalLineToRelative(15.276f)
                lineTo(3.0f, 24.0f)
                lineTo(3.0f, 8.724f)
                curveToRelative(-1.742f, -0.621f, -3.0f, -2.271f, -3.0f, -4.224f)
                curveTo(0.0f, 2.019f, 2.019f, 0.0f, 4.5f, 0.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                curveToRelative(0.0f, 1.953f, -1.258f, 3.602f, -3.0f, 4.224f)
                close()
                moveTo(6.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.0f, 21.0f)
                close()
                moveTo(18.0f, 21.0f)
                lineTo(18.0f, 3.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(11.0f, 21.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _insertCreditCard!!
    }

private var _insertCreditCard: ImageVector? = null
