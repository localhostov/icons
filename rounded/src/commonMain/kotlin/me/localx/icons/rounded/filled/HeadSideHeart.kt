package me.localx.icons.rounded.filled

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
                curveToRelative(0.0f, 0.87f, -1.17f, 2.35f, -3.0f, 3.79f)
                curveToRelative(-1.83f, -1.44f, -3.0f, -2.92f, -3.0f, -3.79f)
                curveToRelative(0.0f, -0.64f, 0.45f, -1.16f, 1.0f, -1.16f)
                curveToRelative(0.5f, 0.0f, 1.0f, 0.31f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.69f, 0.5f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.52f, 1.0f, 1.16f)
                close()
                moveTo(24.0f, 13.0f)
                curveToRelative(0.0f, 0.97f, -0.7f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-0.33f)
                lineToRelative(-0.22f, 1.66f)
                curveToRelative(-0.33f, 2.48f, -2.46f, 4.34f, -4.96f, 4.34f)
                horizontalLineToRelative(-0.49f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                lineTo(6.0f, 24.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-0.97f)
                curveToRelative(0.0f, -0.9f, -0.26f, -1.73f, -0.74f, -2.35f)
                curveTo(0.58f, 15.48f, -0.2f, 12.75f, 0.05f, 9.98f)
                curveTo(0.5f, 4.95f, 4.46f, 0.79f, 9.45f, 0.11f)
                curveToRelative(4.04f, -0.56f, 7.91f, 1.06f, 10.35f, 4.31f)
                curveToRelative(1.27f, 1.57f, 4.2f, 7.16f, 4.2f, 8.58f)
                close()
                moveTo(16.0f, 10.16f)
                curveToRelative(0.0f, -1.74f, -1.35f, -3.16f, -3.0f, -3.16f)
                curveToRelative(-0.78f, 0.0f, -1.48f, 0.27f, -2.0f, 0.73f)
                curveToRelative(-0.52f, -0.46f, -1.22f, -0.73f, -2.0f, -0.73f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.42f, -3.0f, 3.16f)
                curveToRelative(0.0f, 2.03f, 2.12f, 4.09f, 3.9f, 5.47f)
                curveToRelative(0.32f, 0.25f, 0.71f, 0.38f, 1.1f, 0.38f)
                reflectiveCurveToRelative(0.77f, -0.12f, 1.1f, -0.38f)
                curveToRelative(1.78f, -1.38f, 3.9f, -3.44f, 3.9f, -5.47f)
                close()
            }
        }
        .build()
        return _headSideHeart!!
    }

private var _headSideHeart: ImageVector? = null
