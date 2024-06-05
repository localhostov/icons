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

public val Icons.Outline.Guide: ImageVector
    get() {
        if (_guide != null) {
            return _guide!!
        }
        _guide = Builder(name = "Guide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.35f)
                curveTo(11.824f, 1.673f, 9.607f, 0.0f, 7.0f, 0.0f)
                curveTo(3.691f, 0.0f, 1.0f, 2.691f, 1.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(7.0f, 10.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(7.0f, 2.0f)
                curveToRelative(1.474f, 0.0f, 2.75f, 0.81f, 3.444f, 2.0f)
                lineTo(3.556f, 4.0f)
                curveToRelative(0.694f, -1.19f, 1.97f, -2.0f, 3.444f, -2.0f)
                close()
                moveTo(13.601f, 18.666f)
                curveToRelative(0.265f, 0.747f, 0.399f, 1.532f, 0.399f, 2.334f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.573f, -0.096f, -1.134f, -0.284f, -1.666f)
                curveToRelative(-0.185f, -0.521f, 0.088f, -1.092f, 0.608f, -1.276f)
                curveToRelative(0.518f, -0.183f, 1.092f, 0.087f, 1.276f, 0.608f)
                close()
                moveTo(23.565f, 3.364f)
                lineToRelative(-3.565f, 1.885f)
                verticalLineToRelative(3.814f)
                curveToRelative(0.0f, 0.893f, -0.394f, 1.733f, -1.08f, 2.305f)
                lineToRelative(-4.723f, 3.937f)
                curveToRelative(-0.538f, 0.448f, -1.22f, 0.695f, -1.921f, 0.695f)
                horizontalLineToRelative(-5.276f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.859f, 3.141f, -7.0f, 7.0f, -7.0f)
                horizontalLineToRelative(5.276f)
                curveToRelative(0.233f, 0.0f, 0.461f, -0.082f, 0.64f, -0.231f)
                lineToRelative(4.724f, -3.938f)
                curveToRelative(0.229f, -0.19f, 0.36f, -0.47f, 0.36f, -0.768f)
                lineTo(18.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.6f, 0.0f, 1.195f, 0.128f, 1.751f, 0.377f)
                lineToRelative(2.813f, 1.259f)
                curveToRelative(0.581f, 0.399f, 0.581f, 1.329f, 0.0f, 1.729f)
                close()
            }
        }
        .build()
        return _guide!!
    }

private var _guide: ImageVector? = null
