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

public val Icons.Filled.HeadSideHeart: ImageVector
    get() {
        if (_headSideHeart != null) {
            return _headSideHeart!!
        }
        _headSideHeart = Builder(name = "HeadSideHeart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.16f)
                curveToRelative(0.0f, 1.05f, -1.61f, 2.71f, -3.0f, 3.8f)
                curveToRelative(-1.39f, -1.09f, -3.0f, -2.75f, -3.0f, -3.8f)
                curveToRelative(0.0f, -0.64f, 0.45f, -1.16f, 1.0f, -1.16f)
                curveToRelative(0.5f, 0.0f, 1.0f, 0.31f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.69f, 0.5f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.52f, 1.0f, 1.16f)
                close()
                moveTo(24.0f, 12.79f)
                verticalLineToRelative(2.21f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(-0.45f, 3.39f)
                curveToRelative(-0.2f, 1.49f, -1.47f, 2.61f, -2.97f, 2.61f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-4.71f)
                curveToRelative(0.0f, -0.46f, -0.16f, -0.91f, -0.46f, -1.26f)
                curveTo(0.67f, 15.78f, -0.22f, 12.92f, 0.05f, 9.98f)
                curveTo(0.5f, 4.95f, 4.46f, 0.79f, 9.45f, 0.11f)
                curveToRelative(4.04f, -0.56f, 7.91f, 1.06f, 10.35f, 4.31f)
                curveToRelative(1.18f, 1.46f, 2.3f, 4.02f, 3.48f, 6.72f)
                lineToRelative(0.72f, 1.65f)
                close()
                moveTo(16.0f, 10.16f)
                curveToRelative(0.0f, -1.74f, -1.35f, -3.16f, -3.0f, -3.16f)
                curveToRelative(-0.78f, 0.0f, -1.48f, 0.27f, -2.0f, 0.73f)
                curveToRelative(-0.52f, -0.46f, -1.22f, -0.73f, -2.0f, -0.73f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.42f, -3.0f, 3.16f)
                curveToRelative(0.0f, 2.65f, 3.69f, 5.35f, 4.43f, 5.86f)
                lineToRelative(0.57f, 0.4f)
                lineToRelative(0.57f, -0.4f)
                curveToRelative(0.74f, -0.51f, 4.43f, -3.21f, 4.43f, -5.86f)
                close()
            }
        }
        .build()
        return _headSideHeart!!
    }

private var _headSideHeart: ImageVector? = null
