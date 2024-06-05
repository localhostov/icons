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

public val Icons.Bold.BellSchool: ImageVector
    get() {
        if (_bellSchool != null) {
            return _bellSchool!!
        }
        _bellSchool = Builder(name = "BellSchool", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                close()
                moveTo(20.5f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.086f, 6.991f)
                curveToRelative(-1.25f, 3.585f, -4.446f, 6.2f, -8.845f, 7.0f)
                arcToRelative(0.451f, 0.451f, 0.0f, false, true, -0.382f, -0.105f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.187f, -0.4f)
                verticalLineToRelative(-1.615f)
                arcToRelative(9.387f, 9.387f, 0.0f, false, false, 5.392f, -2.839f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.179f, -2.063f)
                arcToRelative(6.431f, 6.431f, 0.0f, false, true, -4.713f, 2.031f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 5.281f, -10.281f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.438f, -1.748f)
                arcToRelative(9.5f, 9.5f, 0.0f, true, false, -9.219f, 14.899f)
                verticalLineToRelative(1.62f)
                arcToRelative(3.508f, 3.508f, 0.0f, false, false, 1.265f, 2.7f)
                arcToRelative(3.463f, 3.463f, 0.0f, false, false, 2.222f, 0.81f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.618f, -0.056f)
                curveToRelative(7.115f, -1.292f, 11.895f, -6.694f, 11.895f, -13.444f)
                arcToRelative(3.525f, 3.525f, 0.0f, false, false, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _bellSchool!!
    }

private var _bellSchool: ImageVector? = null
