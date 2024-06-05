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

public val Icons.Bold.TachometerAltFastest: ImageVector
    get() {
        if (_tachometerAltFastest != null) {
            return _tachometerAltFastest!!
        }
        _tachometerAltFastest = Builder(name = "TachometerAltFastest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.017f, 4.059f)
                arcTo(12.015f, 12.015f, 0.0f, false, false, 0.1f, 11.4f)
                arcTo(11.865f, 11.865f, 0.0f, false, false, 3.614f, 21.488f)
                arcTo(5.317f, 5.317f, 0.0f, false, false, 7.342f, 23.0f)
                horizontalLineToRelative(9.322f)
                arcToRelative(5.175f, 5.175f, 0.0f, false, false, 3.574f, -1.371f)
                arcTo(11.969f, 11.969f, 0.0f, false, false, 20.017f, 4.059f)
                close()
                moveTo(18.183f, 19.444f)
                arcTo(2.225f, 2.225f, 0.0f, false, true, 16.664f, 20.0f)
                lineTo(7.342f, 20.0f)
                arcToRelative(2.333f, 2.333f, 0.0f, false, true, -1.636f, -0.662f)
                arcToRelative(8.894f, 8.894f, 0.0f, false, true, -2.631f, -7.564f)
                arcTo(9.008f, 9.008f, 0.0f, false, true, 10.952f, 4.06f)
                curveTo(19.411f, 3.0f, 24.471f, 13.614f, 18.183f, 19.444f)
                close()
                moveTo(17.812f, 16.229f)
                arcToRelative(1.505f, 1.505f, 0.0f, false, true, -2.041f, 0.583f)
                lineToRelative(-3.344f, -1.858f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 1.458f, -2.623f)
                lineToRelative(3.344f, 1.857f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.812f, 16.229f)
                close()
                moveTo(17.583f, 11.836f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.019f, -0.653f)
                curveToRelative(-2.9f, -5.1f, -10.171f, -0.324f, -6.65f, 4.362f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 6.6f, 17.455f)
                curveTo(0.478f, 9.184f, 13.1f, 0.913f, 18.236f, 9.817f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.583f, 11.836f)
                close()
            }
        }
        .build()
        return _tachometerAltFastest!!
    }

private var _tachometerAltFastest: ImageVector? = null
