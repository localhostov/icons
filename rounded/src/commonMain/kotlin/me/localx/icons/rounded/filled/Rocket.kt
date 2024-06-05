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

public val Icons.Filled.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.351f, 0.649f)
                arcToRelative(2.188f, 2.188f, 0.0f, false, false, -2.31f, -0.515f)
                lineToRelative(-0.216f, 0.077f)
                arcToRelative(32.72f, 32.72f, 0.0f, false, false, -12.861f, 7.825f)
                arcToRelative(22.707f, 22.707f, 0.0f, false, false, -2.471f, 3.016f)
                curveToRelative(-1.4f, 2.0f, -1.666f, 4.189f, 0.054f, 5.91f)
                lineToRelative(0.039f, 0.038f)
                lineToRelative(-2.293f, 2.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(0.038f, 0.039f)
                curveToRelative(1.721f, 1.72f, 3.915f, 1.452f, 5.91f, 0.054f)
                arcToRelative(22.707f, 22.707f, 0.0f, false, false, 3.016f, -2.471f)
                arcToRelative(32.72f, 32.72f, 0.0f, false, false, 7.825f, -12.862f)
                lineToRelative(0.077f, -0.216f)
                arcToRelative(2.186f, 2.186f, 0.0f, false, false, -0.515f, -2.309f)
                close()
                moveTo(11.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(14.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(17.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(2.363f, 13.038f)
                arcToRelative(2.362f, 2.362f, 0.0f, false, true, -2.363f, -2.362f)
                arcToRelative(2.413f, 2.413f, 0.0f, false, true, 0.665f, -1.654f)
                arcToRelative(9.776f, 9.776f, 0.0f, false, true, 6.46f, -2.944f)
                curveToRelative(-0.191f, 0.182f, -0.386f, 0.355f, -0.575f, 0.544f)
                arcToRelative(24.8f, 24.8f, 0.0f, false, false, -2.695f, 3.278f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -1.38f, 3.133f)
                close()
                moveTo(11.0f, 21.525f)
                arcToRelative(8.185f, 8.185f, 0.0f, false, false, 3.133f, -1.38f)
                arcToRelative(24.739f, 24.739f, 0.0f, false, false, 3.283f, -2.695f)
                curveToRelative(0.19f, -0.189f, 0.362f, -0.384f, 0.545f, -0.575f)
                arcToRelative(9.782f, 9.782f, 0.0f, false, true, -2.945f, 6.46f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, true, -1.653f, 0.665f)
                arcToRelative(2.363f, 2.363f, 0.0f, false, true, -2.363f, -2.363f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
