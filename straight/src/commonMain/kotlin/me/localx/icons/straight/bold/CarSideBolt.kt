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

public val Icons.Bold.CarSideBolt: ImageVector
    get() {
        if (_carSideBolt != null) {
            return _carSideBolt!!
        }
        _carSideBolt = Builder(name = "CarSideBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.5f)
                curveToRelative(0.0f, -1.832f, -1.415f, -3.339f, -3.209f, -3.488f)
                lineToRelative(-4.541f, -6.514f)
                curveToRelative(-0.654f, -0.938f, -1.728f, -1.499f, -2.871f, -1.499f)
                lineTo(6.881f, 1.999f)
                curveToRelative(-1.446f, 0.0f, -2.761f, 0.908f, -3.272f, 2.258f)
                lineTo(1.031f, 11.042f)
                curveToRelative(-0.66f, 0.654f, -1.031f, 1.528f, -1.031f, 2.458f)
                verticalLineToRelative(5.5f)
                lineTo(3.05f, 19.0f)
                curveToRelative(-0.033f, 0.162f, -0.05f, 0.329f, -0.05f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.171f, -0.017f, -0.338f, -0.05f, -0.5f)
                horizontalLineToRelative(8.1f)
                curveToRelative(-0.033f, 0.162f, -0.05f, 0.329f, -0.05f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.171f, -0.017f, -0.338f, -0.05f, -0.5f)
                horizontalLineToRelative(3.05f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(21.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.197f, 0.131f, -0.326f, 0.209f, -0.385f)
                lineToRelative(0.342f, -0.26f)
                lineToRelative(2.863f, -7.532f)
                curveToRelative(0.073f, -0.193f, 0.261f, -0.322f, 0.467f, -0.322f)
                horizontalLineToRelative(6.499f)
                curveToRelative(0.163f, 0.0f, 0.316f, 0.08f, 0.41f, 0.214f)
                lineToRelative(5.428f, 7.786f)
                horizontalLineToRelative(1.283f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(13.749f, 10.109f)
                curveToRelative(0.367f, 0.684f, 0.329f, 1.511f, -0.101f, 2.157f)
                lineToRelative(-2.467f, 3.158f)
                lineToRelative(-2.362f, -1.85f)
                lineToRelative(1.233f, -1.575f)
                horizontalLineToRelative(-0.937f)
                curveToRelative(-0.667f, 0.0f, -1.301f, -0.32f, -1.699f, -0.855f)
                curveToRelative(-0.397f, -0.535f, -0.519f, -1.235f, -0.325f, -1.873f)
                lineToRelative(2.131f, -3.558f)
                lineToRelative(2.555f, 1.572f)
                lineToRelative(-1.054f, 1.714f)
                horizontalLineToRelative(1.172f)
                curveToRelative(0.776f, 0.0f, 1.487f, 0.425f, 1.854f, 1.109f)
                close()
            }
        }
        .build()
        return _carSideBolt!!
    }

private var _carSideBolt: ImageVector? = null
