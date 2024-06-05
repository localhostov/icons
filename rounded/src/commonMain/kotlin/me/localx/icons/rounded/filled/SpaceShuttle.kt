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

public val Icons.Filled.SpaceShuttle: ImageVector
    get() {
        if (_spaceShuttle != null) {
            return _spaceShuttle!!
        }
        _spaceShuttle = Builder(name = "SpaceShuttle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 0.785f, -0.378f, 1.933f, -2.178f, 2.946f)
                arcToRelative(8.292f, 8.292f, 0.0f, false, true, -2.96f, 0.964f)
                arcToRelative(6.914f, 6.914f, 0.0f, false, false, -0.26f, -7.851f)
                arcToRelative(8.38f, 8.38f, 0.0f, false, true, 3.22f, 1.0f)
                curveTo(23.622f, 10.067f, 24.0f, 11.215f, 24.0f, 12.0f)
                close()
                moveTo(15.9f, 8.0f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(8.0f)
                lineTo(16.421f, 16.0f)
                curveTo(18.57f, 13.336f, 18.517f, 10.269f, 15.9f, 8.0f)
                close()
                moveTo(4.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(4.0f, 16.0f)
                close()
                moveTo(12.485f, 6.0f)
                lineTo(10.557f, 2.556f)
                arcTo(5.007f, 5.007f, 0.0f, false, false, 6.194f, 0.0f)
                lineTo(5.038f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                lineTo(2.038f, 6.0f)
                close()
                moveTo(2.0f, 18.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(6.156f, 24.0f)
                arcToRelative(5.005f, 5.005f, 0.0f, false, false, 4.362f, -2.556f)
                lineTo(12.447f, 18.0f)
                close()
            }
        }
        .build()
        return _spaceShuttle!!
    }

private var _spaceShuttle: ImageVector? = null
