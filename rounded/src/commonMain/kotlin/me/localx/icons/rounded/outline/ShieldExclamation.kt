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

public val Icons.Outline.ShieldExclamation: ImageVector
    get() {
        if (_shieldExclamation != null) {
            return _shieldExclamation!!
        }
        _shieldExclamation = Builder(name = "ShieldExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(8.0f)
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
                arcToRelative(4.628f, 4.628f, 0.0f, false, false, 0.847f, 0.307f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.793f, -0.24f)
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
        return _shieldExclamation!!
    }

private var _shieldExclamation: ImageVector? = null
