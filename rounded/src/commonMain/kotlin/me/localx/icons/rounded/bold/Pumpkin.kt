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

public val Icons.Bold.Pumpkin: ImageVector
    get() {
        if (_pumpkin != null) {
            return _pumpkin!!
        }
        _pumpkin = Builder(name = "Pumpkin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 6.0f)
                arcToRelative(5.324f, 5.324f, 0.0f, false, false, -2.287f, 0.619f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, -0.662f, -0.315f)
                curveTo(13.894f, 3.106f, 15.977f, 3.0f, 16.0f, 3.0f)
                curveToRelative(0.7f, 0.0f, 1.0f, 0.379f, 1.0f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                arcTo(3.779f, 3.779f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(5.371f, 5.371f, 0.0f, false, false, -3.8f, 1.879f)
                arcTo(5.392f, 5.392f, 0.0f, false, false, 10.171f, 0.158f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.829f, 2.842f)
                curveToRelative(0.888f, 0.444f, 1.511f, 1.235f, 1.643f, 3.452f)
                arcToRelative(4.82f, 4.82f, 0.0f, false, false, -0.686f, 0.325f)
                arcTo(5.327f, 5.327f, 0.0f, false, false, 7.5f, 6.0f)
                curveTo(4.485f, 6.0f, 0.0f, 8.4f, 0.0f, 15.0f)
                curveToRelative(0.0f, 6.14f, 4.484f, 9.0f, 7.515f, 9.0f)
                arcToRelative(4.143f, 4.143f, 0.0f, false, false, 2.177f, -0.67f)
                arcToRelative(4.31f, 4.31f, 0.0f, false, false, 4.616f, 0.0f)
                arcToRelative(4.143f, 4.143f, 0.0f, false, false, 2.176f, 0.67f)
                curveTo(19.516f, 24.0f, 24.0f, 21.14f, 24.0f, 15.0f)
                curveTo(24.0f, 8.4f, 19.516f, 6.0f, 16.5f, 6.0f)
                close()
                moveTo(3.0f, 15.0f)
                curveToRelative(0.0f, -4.746f, 2.943f, -6.0f, 4.474f, -6.0f)
                lineTo(7.5f, 9.0f)
                arcTo(11.874f, 11.874f, 0.0f, false, false, 6.0f, 15.0f)
                arcToRelative(11.888f, 11.888f, 0.0f, false, false, 1.5f, 6.0f)
                curveTo(6.584f, 20.989f, 3.0f, 19.909f, 3.0f, 15.0f)
                close()
                moveTo(9.0f, 15.0f)
                curveToRelative(0.0f, -3.434f, 1.584f, -6.0f, 3.0f, -6.0f)
                reflectiveCurveToRelative(3.0f, 2.566f, 3.0f, 6.0f)
                reflectiveCurveToRelative(-1.584f, 6.0f, -3.0f, 6.0f)
                reflectiveCurveTo(9.0f, 18.434f, 9.0f, 15.0f)
                close()
                moveTo(16.5f, 21.0f)
                arcTo(11.888f, 11.888f, 0.0f, false, false, 18.0f, 15.0f)
                arcToRelative(11.879f, 11.879f, 0.0f, false, false, -1.5f, -6.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.556f, 0.0f, 4.5f, 1.254f, 4.5f, 6.0f)
                curveTo(21.0f, 19.908f, 17.417f, 20.989f, 16.5f, 21.0f)
                close()
            }
        }
        .build()
        return _pumpkin!!
    }

private var _pumpkin: ImageVector? = null
