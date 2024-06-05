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

public val Icons.Bold.Clouds: ImageVector
    get() {
        if (_clouds != null) {
            return _clouds!!
        }
        _clouds = Builder(name = "Clouds", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.54f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.422f, 20.0f)
                arcToRelative(5.467f, 5.467f, 0.0f, false, true, -1.23f, -2.282f)
                arcToRelative(5.767f, 5.767f, 0.0f, false, true, 2.5f, -6.3f)
                arcToRelative(8.113f, 8.113f, 0.0f, false, true, -0.541f, -4.823f)
                arcTo(8.053f, 8.053f, 0.0f, false, true, 8.884f, 0.087f)
                arcTo(8.184f, 8.184f, 0.0f, false, true, 17.979f, 6.0f)
                arcToRelative(8.255f, 8.255f, 0.0f, false, true, 4.906f, 3.743f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.3f, 11.261f)
                arcToRelative(5.22f, 5.22f, 0.0f, false, false, -3.788f, -2.508f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.289f, -1.288f)
                arcToRelative(5.118f, 5.118f, 0.0f, false, false, -2.0f, -3.419f)
                arcToRelative(5.206f, 5.206f, 0.0f, false, false, -3.909f, -0.99f)
                arcTo(5.055f, 5.055f, 0.0f, false, false, 5.1f, 7.15f)
                arcToRelative(5.119f, 5.119f, 0.0f, false, false, 0.455f, 3.3f)
                arcTo(2.483f, 2.483f, 0.0f, false, true, 4.54f, 13.806f)
                arcTo(2.761f, 2.761f, 0.0f, false, false, 3.1f, 16.963f)
                arcTo(2.463f, 2.463f, 0.0f, false, false, 3.657f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.54f, 20.5f)
                close()
                moveTo(18.85f, 24.0f)
                arcToRelative(5.492f, 5.492f, 0.0f, false, false, 1.107f, -0.134f)
                arcToRelative(5.15f, 5.15f, 0.0f, false, false, 0.154f, -10.024f)
                arcToRelative(1.812f, 1.812f, 0.0f, false, true, -0.337f, -0.1f)
                arcToRelative(6.217f, 6.217f, 0.0f, false, false, -6.628f, -3.677f)
                arcTo(6.109f, 6.109f, 0.0f, false, false, 8.0f, 15.971f)
                arcToRelative(5.934f, 5.934f, 0.0f, false, false, 0.058f, 0.95f)
                arcToRelative(3.728f, 3.728f, 0.0f, false, false, 0.769f, 6.95f)
                arcTo(4.153f, 4.153f, 0.0f, false, false, 9.774f, 24.0f)
                close()
                moveTo(17.012f, 14.914f)
                verticalLineToRelative(0.0f)
                arcToRelative(3.046f, 3.046f, 0.0f, false, false, 2.335f, 1.825f)
                arcToRelative(2.149f, 2.149f, 0.0f, false, true, -0.047f, 4.2f)
                arcToRelative(2.479f, 2.479f, 0.0f, false, true, -0.479f, 0.062f)
                lineTo(9.814f, 21.001f)
                arcToRelative(0.976f, 0.976f, 0.0f, false, true, -0.786f, -0.56f)
                curveToRelative(-0.123f, -0.458f, 0.3f, -0.825f, 0.6f, -0.95f)
                arcToRelative(2.447f, 2.447f, 0.0f, false, false, 1.444f, -2.783f)
                arcToRelative(2.875f, 2.875f, 0.0f, false, true, -0.067f, -0.68f)
                arcToRelative(3.113f, 3.113f, 0.0f, false, true, 2.567f, -2.992f)
                arcTo(3.361f, 3.361f, 0.0f, false, true, 14.047f, 13.0f)
                arcTo(3.2f, 3.2f, 0.0f, false, true, 17.012f, 14.914f)
                close()
            }
        }
        .build()
        return _clouds!!
    }

private var _clouds: ImageVector? = null
