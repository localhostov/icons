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

public val Icons.Filled.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) {
            return _cloudSnow!!
        }
        _cloudSnow = Builder(name = "CloudSnow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 21.0f)
                lineTo(12.205f, 21.0f)
                lineToRelative(0.9f, 1.575f)
                lineToRelative(-1.734f, 1.0f)
                lineTo(10.5f, 22.046f)
                lineTo(9.626f, 23.57f)
                lineToRelative(-1.734f, -1.0f)
                lineTo(8.8f, 21.0f)
                lineTo(7.0f, 21.0f)
                lineTo(7.0f, 19.0f)
                lineTo(8.753f, 19.0f)
                lineToRelative(-0.861f, -1.5f)
                lineToRelative(1.734f, -1.0f)
                lineToRelative(0.874f, 1.525f)
                lineToRelative(0.874f, -1.525f)
                lineToRelative(1.734f, 1.0f)
                lineTo(12.247f, 19.0f)
                lineTo(14.0f, 19.0f)
                close()
                moveTo(24.0f, 12.5f)
                arcTo(7.508f, 7.508f, 0.0f, false, true, 16.5f, 20.0f)
                lineTo(16.0f, 20.0f)
                curveToRelative(-0.225f, -7.272f, -10.777f, -7.267f, -11.0f, 0.0f)
                curveToRelative(-4.909f, 0.022f, -6.849f, -7.148f, -2.734f, -9.951f)
                curveTo(-0.043f, 0.307f, 13.534f, -4.115f, 17.44f, 5.059f)
                arcTo(7.461f, 7.461f, 0.0f, false, true, 24.0f, 12.5f)
                close()
                moveTo(18.0f, 9.534f)
                lineTo(16.226f, 9.534f)
                lineTo(17.108f, 8.0f)
                lineTo(15.374f, 7.0f)
                lineTo(14.5f, 8.524f)
                lineTo(13.626f, 7.0f)
                lineTo(11.892f, 8.0f)
                lineToRelative(0.882f, 1.539f)
                lineTo(11.0f, 9.539f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.774f)
                lineToRelative(-0.882f, 1.538f)
                lineToRelative(1.734f, 1.0f)
                lineToRelative(0.874f, -1.524f)
                lineToRelative(0.874f, 1.524f)
                lineToRelative(1.734f, -1.0f)
                lineToRelative(-0.882f, -1.538f)
                lineTo(18.0f, 11.539f)
                close()
            }
        }
        .build()
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null
