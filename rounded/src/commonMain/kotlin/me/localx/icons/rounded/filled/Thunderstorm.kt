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

public val Icons.Filled.Thunderstorm: ImageVector
    get() {
        if (_thunderstorm != null) {
            return _thunderstorm!!
        }
        _thunderstorm = Builder(name = "Thunderstorm", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.892f, 24.015f)
                arcToRelative(1.913f, 1.913f, 0.0f, false, true, -0.815f, -0.186f)
                arcToRelative(1.844f, 1.844f, 0.0f, false, true, -1.0f, -2.207f)
                lineTo(10.026f, 19.0f)
                horizontalLineToRelative(-1.1f)
                arcToRelative(1.933f, 1.933f, 0.0f, false, true, -1.84f, -2.479f)
                lineToRelative(2.132f, -5.174f)
                curveToRelative(0.541f, -1.676f, 2.453f, -1.326f, 3.811f, -1.347f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.413f, 2.0f)
                lineTo(13.0f, 15.0f)
                horizontalLineToRelative(1.094f)
                arcToRelative(1.905f, 1.905f, 0.0f, false, true, 1.587f, 2.958f)
                lineTo(12.419f, 23.2f)
                arcTo(1.848f, 1.848f, 0.0f, false, true, 10.892f, 24.015f)
                close()
                moveTo(17.974f, 5.146f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, true, -0.743f, -0.569f)
                arcTo(8.057f, 8.057f, 0.0f, false, false, 8.5f, 0.137f)
                arcToRelative(7.946f, 7.946f, 0.0f, false, false, -6.384f, 6.5f)
                arcToRelative(8.146f, 8.146f, 0.0f, false, false, 0.033f, 2.889f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.345f, 0.9f)
                arcTo(5.526f, 5.526f, 0.0f, false, false, 5.5f, 20.0f)
                horizontalLineToRelative(0.834f)
                arcToRelative(3.976f, 3.976f, 0.0f, false, true, -0.56f, -0.584f)
                arcToRelative(3.887f, 3.887f, 0.0f, false, true, -0.605f, -3.474f)
                lineToRelative(2.179f, -5.313f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.1f, 8.0f)
                horizontalLineToRelative(1.921f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.3f, 4.673f)
                lineToRelative(-0.081f, 0.2f)
                lineToRelative(-0.288f, 0.6f)
                arcToRelative(3.908f, 3.908f, 0.0f, false, true, 1.394f, 5.594f)
                lineToRelative(-0.574f, 0.922f)
                curveTo(25.6f, 19.507f, 26.607f, 7.044f, 17.974f, 5.146f)
                close()
            }
        }
        .build()
        return _thunderstorm!!
    }

private var _thunderstorm: ImageVector? = null
