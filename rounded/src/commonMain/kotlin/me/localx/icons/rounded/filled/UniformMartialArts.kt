package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.UniformMartialArts: ImageVector
    get() {
        if (_uniformMartialArts != null) {
            return _uniformMartialArts!!
        }
        _uniformMartialArts = Builder(name = "UniformMartialArts", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.416f, 0.0f)
                lineToRelative(-6.836f, 0.0f)
                lineToRelative(3.445f, 6.028f)
                lineToRelative(3.391f, -6.028f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.366f, 0.156f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                close()
                moveTo(6.366f, 0.156f)
                curveToRelative(-0.624f, 0.115f, -1.318f, 0.296f, -1.943f, 0.536f)
                curveTo(1.777f, 1.709f, 0.0f, 4.326f, 0.0f, 7.204f)
                verticalLineToRelative(11.796f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(3.0f, 8.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(1.978f)
                lineToRelative(3.904f, -6.941f)
                lineTo(6.366f, 0.156f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 20.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.83f, -0.51f, -1.753f, -1.0f, -2.436f)
                curveToRelative(-0.49f, 0.683f, -1.0f, 1.607f, -1.0f, 2.436f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.111f, 0.464f, -2.165f, 0.975f, -3.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.975f)
                curveToRelative(0.511f, 0.835f, 0.975f, 1.889f, 0.975f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.577f, 0.691f)
                curveToRelative(-0.65f, -0.249f, -1.302f, -0.426f, -1.951f, -0.54f)
                curveToRelative(-0.001f, 0.0f, -0.002f, 0.002f, -0.003f, 0.003f)
                lineTo(9.272f, 15.0f)
                horizontalLineToRelative(9.728f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineTo(7.204f)
                curveToRelative(0.0f, -2.878f, -1.777f, -5.495f, -4.423f, -6.513f)
                close()
            }
        }
        .build()
        return _uniformMartialArts!!
    }

private var _uniformMartialArts: ImageVector? = null
