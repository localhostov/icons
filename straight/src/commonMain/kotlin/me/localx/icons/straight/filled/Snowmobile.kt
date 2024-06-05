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

public val Icons.Filled.Snowmobile: ImageVector
    get() {
        if (_snowmobile != null) {
            return _snowmobile!!
        }
        _snowmobile = Builder(name = "Snowmobile", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-0.382f)
                lineToRelative(-1.2f, -2.4f)
                arcTo(7.2f, 7.2f, 0.0f, false, false, 21.7f, 17.068f)
                lineToRelative(1.553f, -2.175f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 22.5f, 9.445f)
                lineTo(14.717f, 3.219f)
                lineTo(13.468f, 4.781f)
                lineToRelative(1.441f, 1.153f)
                arcTo(13.551f, 13.551f, 0.0f, false, true, 16.0f, 10.183f)
                arcTo(2.919f, 2.919f, 0.0f, false, true, 13.032f, 13.0f)
                horizontalLineTo(9.823f)
                arcToRelative(3.961f, 3.961f, 0.0f, false, true, 0.7f, 4.706f)
                lineTo(10.361f, 18.0f)
                horizontalLineTo(8.07f)
                lineToRelative(0.692f, -1.24f)
                arcToRelative(1.984f, 1.984f, 0.0f, false, false, 0.145f, -1.546f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, -0.949f, -1.154f)
                lineToRelative(-3.4f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.5f, -1.255f)
                lineTo(4.6f, 9.952f)
                lineToRelative(3.488f, 2.057f)
                lineToRelative(2.1f, -3.437f)
                curveToRelative(1.142f, 0.618f, 2.394f, 1.3f, 3.26f, 1.768f)
                lineTo(14.4f, 8.583f)
                curveToRelative(-0.22f, -0.12f, -5.415f, -2.944f, -6.059f, -3.266f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, false, -2.29f, -0.163f)
                arcTo(2.907f, 2.907f, 0.0f, false, false, 4.365f, 6.572f)
                lineTo(2.317f, 9.826f)
                arcTo(2.986f, 2.986f, 0.0f, false, false, 3.6f, 13.819f)
                lineTo(7.008f, 15.8f)
                lineTo(5.78f, 18.0f)
                horizontalLineTo(3.49f)
                lineTo(4.3f, 16.542f)
                lineTo(1.651f, 15.0f)
                horizontalLineTo(0.0f)
                lineToRelative(1.586f, 3.37f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 24.0f)
                horizontalLineTo(9.0f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, false, 2.82f, -4.0f)
                horizontalLineToRelative(4.518f)
                curveToRelative(0.014f, 0.0f, 0.028f, 0.0f, 0.042f, 0.0f)
                lineToRelative(1.0f, 2.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
                moveTo(10.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.011f, 1.011f, 0.0f, false, true, -0.184f, -2.0f)
                horizontalLineTo(9.1f)
                arcTo(1.012f, 1.012f, 0.0f, false, true, 10.0f, 21.0f)
                close()
                moveTo(8.0f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.0f, 2.5f)
                close()
            }
        }
        .build()
        return _snowmobile!!
    }

private var _snowmobile: ImageVector? = null
