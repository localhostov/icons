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

public val Icons.Filled.FloorAlt: ImageVector
    get() {
        if (_floorAlt != null) {
            return _floorAlt!!
        }
        _floorAlt = Builder(name = "FloorAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.5f, 20.0f)
                lineTo(6.0f, 20.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(9.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                lineTo(18.0f, 6.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(24.0f, 19.5f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-9.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.5f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                close()
                moveTo(4.5f, 0.0f)
                curveTo(2.019f, 0.0f, 0.0f, 2.019f, 0.0f, 4.5f)
                verticalLineToRelative(2.983f)
                lineTo(7.39f, 0.0f)
                horizontalLineToRelative(-2.89f)
                close()
                moveTo(8.127f, 6.453f)
                lineToRelative(-2.162f, -2.163f)
                lineTo(0.0f, 10.33f)
                verticalLineToRelative(1.17f)
                curveToRelative(0.0f, 0.877f, 0.262f, 1.69f, 0.698f, 2.383f)
                lineToRelative(7.429f, -7.429f)
                close()
                moveTo(9.541f, 5.039f)
                lineTo(13.882f, 0.698f)
                curveToRelative(-0.693f, -0.436f, -1.505f, -0.698f, -2.382f, -0.698f)
                horizontalLineToRelative(-1.298f)
                lineToRelative(-2.832f, 2.868f)
                lineToRelative(2.171f, 2.172f)
                close()
                moveTo(6.19f, 11.218f)
                lineToRelative(-4.08f, 4.08f)
                curveToRelative(0.694f, 0.438f, 1.51f, 0.702f, 2.39f, 0.702f)
                horizontalLineToRelative(1.298f)
                lineToRelative(2.587f, -2.587f)
                lineToRelative(-2.194f, -2.195f)
                close()
                moveTo(11.5f, 16.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-2.874f)
                lineToRelative(-7.374f, 7.374f)
                horizontalLineToRelative(2.874f)
                close()
                moveTo(7.604f, 9.804f)
                lineToRelative(2.194f, 2.195f)
                lineToRelative(6.201f, -6.201f)
                verticalLineToRelative(-1.297f)
                curveToRelative(0.0f, -0.88f, -0.264f, -1.696f, -0.702f, -2.39f)
                lineToRelative(-7.694f, 7.694f)
                close()
            }
        }
        .build()
        return _floorAlt!!
    }

private var _floorAlt: ImageVector? = null
