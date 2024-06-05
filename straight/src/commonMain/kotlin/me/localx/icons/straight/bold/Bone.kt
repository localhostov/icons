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

public val Icons.Bold.Bone: ImageVector
    get() {
        if (_bone != null) {
            return _bone!!
        }
        _bone = Builder(name = "Bone", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.09f, 24.0f)
                curveToRelative(-2.17f, 0.0f, -4.04f, -1.43f, -4.68f, -3.41f)
                curveToRelative(-1.99f, -0.64f, -3.42f, -2.5f, -3.42f, -4.68f)
                curveToRelative(0.0f, -2.71f, 2.2f, -4.91f, 4.91f, -4.91f)
                curveToRelative(0.76f, 0.0f, 1.51f, 0.18f, 2.17f, 0.51f)
                lineToRelative(4.42f, -4.42f)
                curveToRelative(-0.33f, -0.67f, -0.51f, -1.41f, -0.51f, -2.17f)
                curveToRelative(0.0f, -2.71f, 2.2f, -4.91f, 4.91f, -4.91f)
                curveToRelative(2.17f, 0.0f, 4.04f, 1.43f, 4.68f, 3.41f)
                curveToRelative(1.99f, 0.64f, 3.42f, 2.5f, 3.42f, 4.68f)
                curveToRelative(0.0f, 2.71f, -2.2f, 4.91f, -4.91f, 4.91f)
                curveToRelative(-0.77f, 0.0f, -1.51f, -0.18f, -2.18f, -0.51f)
                lineToRelative(-4.42f, 4.42f)
                curveToRelative(0.33f, 0.67f, 0.51f, 1.41f, 0.51f, 2.18f)
                curveToRelative(0.0f, 2.71f, -2.2f, 4.91f, -4.91f, 4.91f)
                close()
                moveTo(4.91f, 14.0f)
                curveToRelative(-1.05f, 0.0f, -1.91f, 0.86f, -1.91f, 1.91f)
                reflectiveCurveToRelative(0.78f, 1.84f, 1.79f, 1.9f)
                lineToRelative(1.32f, 0.08f)
                lineToRelative(0.08f, 1.32f)
                curveToRelative(0.06f, 1.0f, 0.9f, 1.78f, 1.9f, 1.78f)
                reflectiveCurveToRelative(1.91f, -0.86f, 1.91f, -1.91f)
                curveToRelative(0.0f, -0.49f, -0.19f, -0.96f, -0.53f, -1.32f)
                lineToRelative(-1.02f, -1.06f)
                lineToRelative(8.26f, -8.26f)
                lineToRelative(1.06f, 1.02f)
                curveToRelative(0.36f, 0.34f, 0.83f, 0.53f, 1.32f, 0.53f)
                curveToRelative(1.05f, 0.0f, 1.91f, -0.86f, 1.91f, -1.91f)
                reflectiveCurveToRelative(-0.78f, -1.84f, -1.79f, -1.9f)
                lineToRelative(-1.32f, -0.08f)
                lineToRelative(-0.08f, -1.32f)
                curveToRelative(-0.06f, -1.0f, -0.9f, -1.78f, -1.9f, -1.78f)
                reflectiveCurveToRelative(-1.91f, 0.86f, -1.91f, 1.91f)
                curveToRelative(0.0f, 0.49f, 0.19f, 0.96f, 0.53f, 1.32f)
                lineToRelative(1.02f, 1.06f)
                lineTo(7.29f, 15.54f)
                lineToRelative(-1.06f, -1.01f)
                curveToRelative(-0.36f, -0.34f, -0.83f, -0.53f, -1.32f, -0.53f)
                close()
            }
        }
        .build()
        return _bone!!
    }

private var _bone: ImageVector? = null
