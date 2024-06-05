package me.localx.icons.straight.filled

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

public val Icons.Filled.CommentArrowUp: ImageVector
    get() {
        if (_commentArrowUp != null) {
            return _commentArrowUp!!
        }
        _commentArrowUp = Builder(name = "CommentArrowUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(12.0f)
                lineTo(24.0f, 12.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(16.293f, 12.038f)
                lineToRelative(-3.293f, -3.293f)
                verticalLineToRelative(9.256f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 8.845f)
                lineToRelative(-3.192f, 3.192f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.91f, -3.91f)
                curveToRelative(0.963f, -0.961f, 2.54f, -0.954f, 3.515f, 0.021f)
                lineToRelative(3.889f, 3.89f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _commentArrowUp!!
    }

private var _commentArrowUp: ImageVector? = null
