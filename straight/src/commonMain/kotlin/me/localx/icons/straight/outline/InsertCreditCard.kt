package me.localx.icons.straight.outline

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

public val Icons.Outline.InsertCreditCard: ImageVector
    get() {
        if (_insertCreditCard != null) {
            return _insertCreditCard!!
        }
        _insertCreditCard = Builder(name = "InsertCreditCard", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                lineTo(4.0f, 0.0f)
                curveTo(1.794f, 0.0f, 0.0f, 1.794f, 0.0f, 4.0f)
                curveToRelative(0.0f, 1.858f, 1.279f, 3.411f, 3.0f, 3.858f)
                lineTo(3.0f, 24.0f)
                lineTo(21.0f, 24.0f)
                lineTo(21.0f, 7.858f)
                curveToRelative(1.721f, -0.447f, 3.0f, -2.0f, 3.0f, -3.858f)
                close()
                moveTo(2.0f, 4.0f)
                curveToRelative(0.0f, -0.737f, 0.405f, -1.375f, 1.0f, -1.722f)
                verticalLineToRelative(3.443f)
                curveToRelative(-0.595f, -0.347f, -1.0f, -0.985f, -1.0f, -1.722f)
                close()
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(8.0f, 22.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(5.0f, 2.0f)
                close()
                moveTo(10.0f, 22.0f)
                lineTo(10.0f, 2.0f)
                horizontalLineToRelative(9.0f)
                lineTo(19.0f, 22.0f)
                lineTo(10.0f, 22.0f)
                close()
                moveTo(21.0f, 5.722f)
                lineTo(21.0f, 2.278f)
                curveToRelative(0.595f, 0.347f, 1.0f, 0.985f, 1.0f, 1.722f)
                reflectiveCurveToRelative(-0.405f, 1.375f, -1.0f, 1.722f)
                close()
                moveTo(17.0f, 18.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _insertCreditCard!!
    }

private var _insertCreditCard: ImageVector? = null
