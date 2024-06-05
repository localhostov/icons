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

public val Icons.Outline.ShieldInterrogation: ImageVector
    get() {
        if (_shieldInterrogation != null) {
            return _shieldInterrogation!!
        }
        _shieldInterrogation = Builder(name = "ShieldInterrogation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                arcToRelative(3.953f, 3.953f, 0.0f, false, true, 1.963f, -3.195f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, false, 1.0f, -2.124f)
                arcToRelative(2.024f, 2.024f, 0.0f, false, false, -1.6f, -1.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.363f, 1.971f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.429f, -3.065f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.5f, 6.57f)
                arcToRelative(1.987f, 1.987f, 0.0f, false, false, -0.929f, 1.443f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(12.793f, 23.76f)
                curveToRelative(2.16f, -0.868f, 9.207f, -4.281f, 9.207f, -11.717f)
                verticalLineToRelative(-5.171f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, false, -3.426f, -4.746f)
                lineToRelative(-6.259f, -2.075f)
                arcToRelative(0.985f, 0.985f, 0.0f, false, false, -0.63f, 0.0f)
                lineToRelative(-6.259f, 2.075f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, false, -3.426f, 4.746f)
                verticalLineToRelative(5.171f)
                curveToRelative(0.0f, 6.562f, 7.005f, 10.576f, 9.153f, 11.65f)
                arcToRelative(2.331f, 2.331f, 0.0f, false, false, 0.847f, 0.307f)
                arcToRelative(2.242f, 2.242f, 0.0f, false, false, 0.793f, -0.24f)
                close()
                moveTo(17.944f, 4.024f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.056f, 2.848f)
                verticalLineToRelative(5.171f)
                curveToRelative(0.0f, 6.183f, -6.087f, 9.111f, -7.953f, 9.861f)
                curveToRelative(-1.888f, -0.944f, -8.047f, -4.445f, -8.047f, -9.861f)
                verticalLineToRelative(-5.171f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.056f, -2.848f)
                lineToRelative(5.944f, -1.97f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _shieldInterrogation!!
    }

private var _shieldInterrogation: ImageVector? = null
