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

public val Icons.Bold.CommentImage: ImageVector
    get() {
        if (_commentImage != null) {
            return _commentImage!!
        }
        _commentImage = Builder(name = "CommentImage", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(7.5f, 7.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15.014f, 17.548f)
                lineToRelative(3.986f, -3.986f)
                verticalLineToRelative(-1.562f)
                curveToRelative(0.0f, -0.803f, -0.136f, -1.575f, -0.387f, -2.294f)
                lineToRelative(-3.6f, 3.6f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-5.448f, 5.448f)
                curveToRelative(0.407f, 0.948f, 1.018f, 1.788f, 1.777f, 2.466f)
                lineToRelative(3.672f, -3.672f)
                lineToRelative(4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _commentImage!!
    }

private var _commentImage: ImageVector? = null
