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
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -3.325f, 1.0f)
                arcToRelative(6.06f, 6.06f, 0.0f, false, false, 0.0f, -7.894f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 3.325f, 1.0f)
                curveTo(23.622f, 10.067f, 24.0f, 11.215f, 24.0f, 12.0f)
                close()
                moveTo(3.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(8.0f)
                lineTo(3.0f, 16.0f)
                close()
                moveTo(12.456f, 6.0f)
                lineTo(9.985f, 1.563f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.351f, 0.0f)
                lineTo(2.0f, 0.0f)
                lineTo(2.0f, 6.0f)
                close()
                moveTo(15.365f, 16.0f)
                curveToRelative(3.474f, -1.972f, 3.467f, -6.033f, 0.0f, -8.0f)
                lineTo(5.0f, 8.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(2.0f, 18.0f)
                verticalLineToRelative(6.0f)
                lineTo(7.351f, 24.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.98f, 22.444f)
                lineTo(12.456f, 18.0f)
                close()
            }
        }
        .build()
        return _spaceShuttle!!
    }

private var _spaceShuttle: ImageVector? = null
