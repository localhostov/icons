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

public val Icons.Outline.CarMechanic: ImageVector
    get() {
        if (_carMechanic != null) {
            return _carMechanic!!
        }
        _carMechanic = Builder(name = "CarMechanic", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.02f, 9.52f)
                arcTo(5.011f, 5.011f, 0.0f, false, false, 15.679f, 7.0f)
                lineTo(8.321f, 7.0f)
                arcTo(5.013f, 5.013f, 0.0f, false, false, 3.98f, 9.52f)
                lineToRelative(-2.058f, 3.6f)
                arcTo(7.022f, 7.022f, 0.0f, false, false, 1.0f, 16.594f)
                lineTo(1.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 3.463f)
                lineTo(3.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                lineTo(17.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineToRelative(-0.537f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 23.0f, 18.0f)
                lineTo(23.0f, 16.594f)
                arcToRelative(7.007f, 7.007f, 0.0f, false, false, -0.923f, -3.474f)
                close()
                moveTo(5.72f, 10.512f)
                arcTo(3.009f, 3.009f, 0.0f, false, true, 8.321f, 9.0f)
                horizontalLineToRelative(7.358f)
                arcToRelative(3.006f, 3.006f, 0.0f, false, true, 2.6f, 1.512f)
                lineTo(20.277f, 14.0f)
                lineTo(3.723f, 14.0f)
                close()
                moveTo(21.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(5.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(3.0f, 16.594f)
                arcTo(5.119f, 5.119f, 0.0f, false, true, 3.036f, 16.0f)
                lineTo(5.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(7.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(19.0f, 16.0f)
                horizontalLineToRelative(1.964f)
                arcToRelative(5.119f, 5.119f, 0.0f, false, true, 0.036f, 0.594f)
                close()
                moveTo(23.493f, 4.649f)
                arcTo(3.015f, 3.015f, 0.0f, false, true, 18.167f, 4.0f)
                lineTo(5.845f, 4.0f)
                arcToRelative(3.015f, 3.015f, 0.0f, false, true, -5.326f, 0.649f)
                curveTo(0.0f, 3.717f, 1.926f, 4.061f, 2.012f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(0.339f, 2.0f, 0.387f, 1.552f, 0.519f, 1.351f)
                arcTo(3.015f, 3.015f, 0.0f, false, true, 5.845f, 2.0f)
                lineTo(18.167f, 2.0f)
                arcToRelative(3.015f, 3.015f, 0.0f, false, true, 5.326f, -0.649f)
                curveToRelative(0.524f, 0.932f, -1.407f, 0.588f, -1.493f, 0.649f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                curveTo(23.673f, 4.0f, 23.625f, 4.448f, 23.493f, 4.649f)
                close()
            }
        }
        .build()
        return _carMechanic!!
    }

private var _carMechanic: ImageVector? = null
