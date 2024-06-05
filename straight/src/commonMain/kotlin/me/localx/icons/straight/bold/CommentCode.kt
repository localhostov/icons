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

public val Icons.Bold.CommentCode: ImageVector
    get() {
        if (_commentCode != null) {
            return _commentCode!!
        }
        _commentCode = Builder(name = "CommentCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.038f, 3.0f, 3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                horizontalLineToRelative(9.0f)
                lineTo(21.0f, 12.0f)
                curveToRelative(0.0f, -4.962f, -4.038f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(18.271f, 13.76f)
                curveToRelative(0.971f, -0.97f, 0.971f, -2.549f, 0.0f, -3.52f)
                lineToRelative(-3.299f, -3.298f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(2.937f, 2.937f)
                lineToRelative(-2.937f, 2.937f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(3.299f, -3.298f)
                close()
                moveTo(11.149f, 14.937f)
                lineToRelative(-2.937f, -2.937f)
                lineToRelative(2.937f, -2.937f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-3.299f, 3.298f)
                curveToRelative(-0.971f, 0.97f, -0.971f, 2.549f, 0.0f, 3.52f)
                lineToRelative(3.299f, 3.298f)
                lineToRelative(2.121f, -2.121f)
                close()
            }
        }
        .build()
        return _commentCode!!
    }

private var _commentCode: ImageVector? = null
