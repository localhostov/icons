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

public val Icons.Outline.HeadSide: ImageVector
    get() {
        if (_headSide != null) {
            return _headSide!!
        }
        _headSide = Builder(name = "HeadSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 21.0f)
                horizontalLineToRelative(0.49f)
                curveToRelative(2.5f, 0.0f, 4.63f, -1.87f, 4.96f, -4.34f)
                lineToRelative(0.22f, -1.66f)
                horizontalLineToRelative(0.33f)
                curveToRelative(1.3f, 0.0f, 2.0f, -1.03f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.42f, -2.93f, -7.01f, -4.2f, -8.58f)
                curveTo(17.36f, 1.16f, 13.49f, -0.45f, 9.45f, 0.11f)
                curveTo(4.46f, 0.79f, 0.5f, 4.95f, 0.05f, 9.98f)
                curveToRelative(-0.25f, 2.77f, 0.54f, 5.5f, 2.21f, 7.69f)
                curveToRelative(0.48f, 0.62f, 0.74f, 1.46f, 0.74f, 2.35f)
                verticalLineToRelative(0.97f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                close()
                moveTo(18.22f, 5.65f)
                curveToRelative(1.31f, 1.62f, 3.65f, 6.45f, 3.78f, 7.35f)
                horizontalLineToRelative(-1.2f)
                curveToRelative(-0.5f, 0.0f, -0.93f, 0.37f, -0.99f, 0.87f)
                lineToRelative(-0.33f, 2.52f)
                curveToRelative(-0.2f, 1.49f, -1.48f, 2.61f, -2.97f, 2.61f)
                horizontalLineToRelative(-1.49f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(6.0f, 22.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-0.97f)
                curveToRelative(0.0f, -1.33f, -0.41f, -2.6f, -1.15f, -3.57f)
                curveToRelative(-1.37f, -1.79f, -2.02f, -4.03f, -1.81f, -6.3f)
                curveToRelative(0.37f, -4.12f, 3.6f, -7.51f, 7.69f, -8.07f)
                curveToRelative(0.43f, -0.06f, 0.86f, -0.09f, 1.28f, -0.09f)
                curveToRelative(2.83f, 0.0f, 5.46f, 1.3f, 7.22f, 3.65f)
                close()
            }
        }
        .build()
        return _headSide!!
    }

private var _headSide: ImageVector? = null
