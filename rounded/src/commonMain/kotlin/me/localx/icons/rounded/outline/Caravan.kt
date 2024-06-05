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

public val Icons.Outline.Caravan: ImageVector
    get() {
        if (_caravan != null) {
            return _caravan!!
        }
        _caravan = Builder(name = "Caravan", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(491.52f, 399.343f)
                horizontalLineToRelative(-40.96f)
                verticalLineToRelative(-266.24f)
                curveToRelative(-0.068f, -67.837f, -55.043f, -122.812f, -122.88f, -122.88f)
                horizontalLineToRelative(-204.8f)
                curveTo(55.043f, 10.291f, 0.068f, 65.267f, 0.0f, 133.103f)
                verticalLineToRelative(204.8f)
                curveToRelative(0.07f, 49.476f, 35.444f, 91.852f, 84.111f, 100.762f)
                curveToRelative(11.021f, 44.044f, 55.659f, 70.814f, 99.703f, 59.793f)
                curveToRelative(28.851f, -7.219f, 51.553f, -29.459f, 59.365f, -58.155f)
                horizontalLineToRelative(248.34f)
                curveToRelative(11.311f, 0.0f, 20.48f, -9.169f, 20.48f, -20.48f)
                curveTo(512.0f, 408.512f, 502.831f, 399.343f, 491.52f, 399.343f)
                close()
                moveTo(40.96f, 174.063f)
                horizontalLineToRelative(92.16f)
                curveToRelative(5.655f, 0.0f, 10.24f, 4.585f, 10.24f, 10.24f)
                verticalLineToRelative(20.48f)
                curveToRelative(0.0f, 5.655f, -4.585f, 10.24f, -10.24f, 10.24f)
                horizontalLineTo(40.96f)
                verticalLineTo(174.063f)
                close()
                moveTo(163.84f, 460.783f)
                curveToRelative(-22.622f, 0.0f, -40.96f, -18.338f, -40.96f, -40.96f)
                curveToRelative(0.0f, -22.622f, 18.338f, -40.96f, 40.96f, -40.96f)
                reflectiveCurveToRelative(40.96f, 18.338f, 40.96f, 40.96f)
                curveTo(204.8f, 442.445f, 186.462f, 460.783f, 163.84f, 460.783f)
                close()
                moveTo(327.68f, 399.343f)
                horizontalLineToRelative(-61.44f)
                verticalLineToRelative(-215.04f)
                curveToRelative(0.0f, -5.655f, 4.585f, -10.24f, 10.24f, -10.24f)
                horizontalLineToRelative(40.96f)
                curveToRelative(5.655f, 0.0f, 10.24f, 4.585f, 10.24f, 10.24f)
                verticalLineTo(399.343f)
                close()
                moveTo(409.6f, 399.343f)
                horizontalLineToRelative(-40.96f)
                verticalLineToRelative(-215.04f)
                curveToRelative(0.0f, -28.277f, -22.923f, -51.2f, -51.2f, -51.2f)
                horizontalLineToRelative(-40.96f)
                curveToRelative(-28.277f, 0.0f, -51.2f, 22.923f, -51.2f, 51.2f)
                verticalLineToRelative(181.391f)
                curveToRelative(-30.705f, -33.766f, -82.969f, -36.247f, -116.735f, -5.543f)
                curveToRelative(-10.923f, 9.932f, -18.985f, 22.61f, -23.349f, 36.713f)
                curveToRelative(-26.207f, -7.644f, -44.228f, -31.663f, -44.237f, -58.962f)
                verticalLineToRelative(-81.92f)
                horizontalLineToRelative(92.16f)
                curveToRelative(28.277f, 0.0f, 51.2f, -22.923f, 51.2f, -51.2f)
                verticalLineToRelative(-20.48f)
                curveToRelative(0.0f, -28.277f, -22.923f, -51.2f, -51.2f, -51.2f)
                horizontalLineTo(40.96f)
                curveToRelative(0.0f, -45.243f, 36.677f, -81.92f, 81.92f, -81.92f)
                horizontalLineToRelative(204.8f)
                curveToRelative(45.243f, 0.0f, 81.92f, 36.677f, 81.92f, 81.92f)
                verticalLineTo(399.343f)
                close()
            }
        }
        .build()
        return _caravan!!
    }

private var _caravan: ImageVector? = null
