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

public val Icons.Filled.HouseDay: ImageVector
    get() {
        if (_houseDay != null) {
            return _houseDay!!
        }
        _houseDay = Builder(name = "HouseDay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.849f, 12.747f)
                lineToRelative(-5.448f, -4.264f)
                curveToRelative(-0.824f, -0.646f, -1.977f, -0.646f, -2.801f, 0.0f)
                lineToRelative(-5.448f, 4.263f)
                curveToRelative(-0.731f, 0.573f, -1.151f, 1.435f, -1.151f, 2.363f)
                verticalLineToRelative(8.891f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-8.891f)
                curveToRelative(0.0f, -0.929f, -0.42f, -1.79f, -1.151f, -2.362f)
                close()
                moveTo(18.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(7.917f, 11.172f)
                curveToRelative(-1.014f, 0.794f, -1.667f, 1.921f, -1.858f, 3.169f)
                lineToRelative(-2.562f, 2.57f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.169f, -2.168f)
                curveToRelative(-0.6f, -0.82f, -1.013f, -1.785f, -1.175f, -2.831f)
                lineTo(0.0f, 10.498f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.078f)
                curveToRelative(0.163f, -1.046f, 0.576f, -2.01f, 1.176f, -2.829f)
                lineToRelative(-2.179f, -2.179f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.179f, 2.179f)
                curveToRelative(0.819f, -0.6f, 1.783f, -1.013f, 2.829f, -1.176f)
                lineTo(8.497f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.077f)
                curveToRelative(1.047f, 0.162f, 2.011f, 0.574f, 2.831f, 1.174f)
                lineToRelative(2.177f, -2.177f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.176f, 2.176f)
                lineToRelative(-0.95f, 0.95f)
                lineToRelative(-5.875f, 4.557f)
                close()
            }
        }
        .build()
        return _houseDay!!
    }

private var _houseDay: ImageVector? = null
