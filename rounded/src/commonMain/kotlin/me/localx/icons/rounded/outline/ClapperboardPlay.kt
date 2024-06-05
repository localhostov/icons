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

public val Icons.Outline.ClapperboardPlay: ImageVector
    get() {
        if (_clapperboardPlay != null) {
            return _clapperboardPlay!!
        }
        _clapperboardPlay = Builder(name = "ClapperboardPlay", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 1.0f)
                lineTo(5.0f, 1.0f)
                curveTo(2.243f, 1.0f, 0.0f, 3.243f, 0.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(22.0f, 7.0f)
                horizontalLineToRelative(-3.894f)
                lineToRelative(3.066f, -3.066f)
                curveToRelative(0.512f, 0.538f, 0.828f, 1.266f, 0.828f, 2.066f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(19.266f, 3.012f)
                lineToRelative(-3.973f, 3.973f)
                reflectiveCurveToRelative(-0.009f, 0.01f, -0.014f, 0.015f)
                horizontalLineToRelative(-3.423f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(3.144f)
                curveToRelative(0.09f, 0.0f, 0.178f, 0.005f, 0.266f, 0.012f)
                close()
                moveTo(13.028f, 3.0f)
                lineToRelative(-3.764f, 3.764f)
                curveToRelative(-0.071f, 0.071f, -0.13f, 0.151f, -0.175f, 0.236f)
                horizontalLineToRelative(-3.483f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(3.422f)
                close()
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(1.778f)
                lineTo(2.778f, 7.0f)
                horizontalLineToRelative(-0.778f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(19.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(15.047f, 15.8f)
                lineToRelative(-4.634f, 2.48f)
                curveToRelative(-0.622f, 0.373f, -1.413f, -0.075f, -1.413f, -0.8f)
                verticalLineToRelative(-4.961f)
                curveToRelative(0.0f, -0.725f, 0.791f, -1.173f, 1.413f, -0.8f)
                lineToRelative(4.634f, 2.48f)
                curveToRelative(0.604f, 0.362f, 0.604f, 1.238f, 0.0f, 1.6f)
                close()
            }
        }
        .build()
        return _clapperboardPlay!!
    }

private var _clapperboardPlay: ImageVector? = null
