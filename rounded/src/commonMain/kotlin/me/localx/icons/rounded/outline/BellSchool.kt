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

public val Icons.Outline.BellSchool: ImageVector
    get() {
        if (_bellSchool != null) {
            return _bellSchool!!
        }
        _bellSchool = Builder(name = "BellSchool", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                close()
                moveTo(24.0f, 10.0f)
                arcToRelative(14.27f, 14.27f, 0.0f, false, true, -11.484f, 13.952f)
                arcToRelative(2.95f, 2.95f, 0.0f, false, true, -2.431f, -0.646f)
                arcToRelative(3.013f, 3.013f, 0.0f, false, true, -1.085f, -2.316f)
                verticalLineToRelative(-1.041f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 9.382f, -15.394f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.682f, 1.091f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 8.708f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.677f, 1.091f)
                arcToRelative(9.959f, 9.959f, 0.0f, false, true, -7.377f, 4.492f)
                verticalLineToRelative(1.053f)
                arcToRelative(1.016f, 1.016f, 0.0f, false, false, 0.367f, 0.781f)
                arcToRelative(0.948f, 0.948f, 0.0f, false, false, 0.791f, 0.213f)
                arcToRelative(12.192f, 12.192f, 0.0f, false, false, 9.47f, -9.053f)
                arcToRelative(2.955f, 2.955f, 0.0f, false, true, -0.628f, 0.069f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                close()
                moveTo(22.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _bellSchool!!
    }

private var _bellSchool: ImageVector? = null
