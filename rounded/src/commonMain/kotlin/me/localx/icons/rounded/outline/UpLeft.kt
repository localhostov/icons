package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.UpLeft: ImageVector
    get() {
        if (_upLeft != null) {
            return _upLeft!!
        }
        _upLeft = Builder(name = "UpLeft", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.55f, 23.02f)
                curveToRelative(-1.07f, 0.0f, -2.07f, -0.42f, -2.83f, -1.17f)
                lineToRelative(-7.17f, -7.17f)
                lineToRelative(-1.47f, 1.47f)
                curveToRelative(-0.88f, 0.87f, -2.13f, 1.11f, -3.27f, 0.64f)
                curveToRelative(-1.14f, -0.48f, -1.85f, -1.54f, -1.84f, -2.77f)
                verticalLineTo(5.02f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.0f, -2.2f, 1.79f, -3.99f, 4.0f, -4.0f)
                horizontalLineTo(13.96f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(1.23f, 0.0f, 2.29f, 0.71f, 2.77f, 1.84f)
                curveToRelative(0.48f, 1.14f, 0.23f, 2.39f, -0.64f, 3.27f)
                lineToRelative(-1.48f, 1.47f)
                lineToRelative(7.17f, 7.17f)
                curveToRelative(1.56f, 1.56f, 1.56f, 4.1f, 0.0f, 5.66f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-0.76f, 0.76f, -1.76f, 1.17f, -2.83f, 1.17f)
                close()
                moveTo(7.55f, 12.26f)
                curveToRelative(0.26f, 0.0f, 0.51f, 0.1f, 0.71f, 0.29f)
                lineToRelative(7.88f, 7.88f)
                curveToRelative(0.76f, 0.76f, 2.07f, 0.76f, 2.83f, 0.0f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f)
                lineToRelative(-7.88f, -7.88f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                reflectiveCurveToRelative(0.11f, -0.52f, 0.29f, -0.71f)
                lineToRelative(2.18f, -2.18f)
                curveToRelative(0.43f, -0.44f, 0.27f, -0.94f, 0.21f, -1.09f)
                reflectiveCurveToRelative(-0.3f, -0.61f, -0.92f, -0.61f)
                horizontalLineTo(4.96f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineTo(14.02f)
                curveToRelative(0.0f, 0.62f, 0.47f, 0.86f, 0.61f, 0.92f)
                curveToRelative(0.14f, 0.06f, 0.65f, 0.22f, 1.09f, -0.21f)
                lineToRelative(2.18f, -2.18f)
                curveToRelative(0.2f, -0.2f, 0.45f, -0.29f, 0.71f, -0.29f)
                close()
            }
        }
        .build()
        return _upLeft!!
    }

private var _upLeft: ImageVector? = null
