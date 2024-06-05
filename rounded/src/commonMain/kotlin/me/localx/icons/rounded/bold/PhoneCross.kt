package me.localx.icons.rounded.bold

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

public val Icons.Bold.PhoneCross: ImageVector
    get() {
        if (_phoneCross != null) {
            return _phoneCross!!
        }
        _phoneCross = Builder(name = "PhoneCross", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7f, 14.025f)
                arcToRelative(3.584f, 3.584f, 0.0f, false, false, -4.945f, 0.0f)
                lineToRelative(-0.411f, 0.4f)
                arcTo(11.6f, 11.6f, 0.0f, false, true, 9.586f, 8.647f)
                lineToRelative(0.388f, -0.394f)
                arcToRelative(3.521f, 3.521f, 0.0f, false, false, 0.039f, -4.91f)
                lineTo(7.861f, 1.025f)
                arcTo(3.583f, 3.583f, 0.0f, false, false, 2.954f, 0.984f)
                lineToRelative(-1.017f, 0.884f)
                curveToRelative(-0.026f, 0.023f, -0.051f, 0.046f, -0.075f, 0.07f)
                curveToRelative(-7.9f, 8.27f, 11.923f, 28.1f, 20.2f, 20.2f)
                curveToRelative(0.023f, -0.025f, 0.046f, -0.049f, 0.069f, -0.075f)
                lineToRelative(0.885f, -1.016f)
                arcToRelative(3.516f, 3.516f, 0.0f, false, false, -0.082f, -4.946f)
                close()
                moveTo(20.856f, 18.967f)
                curveToRelative(-0.024f, 0.024f, -0.048f, 0.05f, -0.071f, 0.075f)
                lineToRelative(-0.877f, 1.008f)
                curveTo(14.654f, 24.773f, -0.91f, 10.127f, 3.949f, 4.1f)
                lineToRelative(1.008f, -0.877f)
                curveToRelative(0.026f, -0.024f, 0.052f, -0.047f, 0.076f, -0.072f)
                arcToRelative(0.488f, 0.488f, 0.0f, false, true, 0.668f, -0.04f)
                lineTo(7.853f, 5.424f)
                arcToRelative(0.485f, 0.485f, 0.0f, false, true, -0.009f, 0.717f)
                lineTo(6.736f, 7.267f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.322f, 1.61f)
                arcTo(14.852f, 14.852f, 0.0f, false, false, 15.146f, 17.6f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.586f, -0.332f)
                lineToRelative(1.127f, -1.109f)
                lineToRelative(0.01f, -0.009f)
                curveToRelative(0.278f, -0.213f, 0.45f, -0.21f, 0.747f, 0.04f)
                lineToRelative(2.237f, 2.074f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 20.853f, 18.967f)
                close()
                moveTo(23.56f, 6.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.121f, 2.122f)
                lineTo(19.5f, 6.621f)
                lineToRelative(-1.94f, 1.94f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.121f, -2.122f)
                lineTo(17.378f, 4.5f)
                lineTo(15.439f, 2.561f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.56f, 0.439f)
                lineToRelative(1.94f, 1.94f)
                lineTo(21.439f, 0.439f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 23.56f, 2.561f)
                lineTo(21.621f, 4.5f)
                close()
            }
        }
        .build()
        return _phoneCross!!
    }

private var _phoneCross: ImageVector? = null
