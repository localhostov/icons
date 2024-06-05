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

public val Icons.Filled.CarMechanic: ImageVector
    get() {
        if (_carMechanic != null) {
            return _carMechanic!!
        }
        _carMechanic = Builder(name = "CarMechanic", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 14.0f)
                horizontalLineTo(1.5f)
                arcToRelative(7.109f, 7.109f, 0.0f, false, true, 0.423f, -0.88f)
                lineTo(3.98f, 9.52f)
                arcTo(5.013f, 5.013f, 0.0f, false, true, 8.321f, 7.0f)
                horizontalLineToRelative(7.358f)
                arcTo(5.011f, 5.011f, 0.0f, false, true, 20.02f, 9.52f)
                lineToRelative(2.057f, 3.6f)
                arcTo(7.116f, 7.116f, 0.0f, false, true, 22.5f, 14.0f)
                close()
                moveTo(19.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(1.026f)
                quadTo(1.0f, 16.3f, 1.0f, 16.594f)
                verticalLineTo(18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 3.463f)
                verticalLineTo(22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineTo(17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineToRelative(-0.537f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 23.0f, 18.0f)
                verticalLineTo(16.594f)
                quadToRelative(0.0f, -0.3f, -0.026f, -0.594f)
                close()
                moveTo(23.0f, 4.0f)
                horizontalLineTo(22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.673f, 0.0f, 0.625f, -0.448f, 0.493f, -0.649f)
                arcTo(3.015f, 3.015f, 0.0f, false, false, 18.167f, 2.0f)
                horizontalLineTo(5.845f)
                arcTo(3.015f, 3.015f, 0.0f, false, false, 0.519f, 1.351f)
                curveTo(0.0f, 2.283f, 1.926f, 1.939f, 2.012f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.673f, 0.0f, -0.625f, 0.448f, -0.493f, 0.649f)
                arcTo(3.015f, 3.015f, 0.0f, false, false, 5.845f, 4.0f)
                horizontalLineTo(18.167f)
                arcToRelative(3.015f, 3.015f, 0.0f, false, false, 5.326f, 0.649f)
                curveTo(23.625f, 4.448f, 23.673f, 4.0f, 23.0f, 4.0f)
                close()
            }
        }
        .build()
        return _carMechanic!!
    }

private var _carMechanic: ImageVector? = null
