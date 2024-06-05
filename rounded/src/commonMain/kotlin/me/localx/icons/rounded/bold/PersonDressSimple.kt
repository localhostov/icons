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

public val Icons.Bold.PersonDressSimple: ImageVector
    get() {
        if (_personDressSimple != null) {
            return _personDressSimple!!
        }
        _personDressSimple = Builder(name = "PersonDressSimple", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(17.111f, 18.801f)
                curveToRelative(-0.312f, 0.358f, -0.694f, 0.637f, -1.111f, 0.84f)
                verticalLineToRelative(2.859f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-2.859f)
                curveToRelative(-0.418f, -0.203f, -0.799f, -0.482f, -1.111f, -0.84f)
                curveToRelative(-0.665f, -0.762f, -0.968f, -1.773f, -0.831f, -2.774f)
                lineToRelative(0.816f, -5.989f)
                curveToRelative(0.315f, -2.302f, 2.304f, -4.038f, 4.626f, -4.038f)
                reflectiveCurveToRelative(4.311f, 1.735f, 4.626f, 4.037f)
                lineToRelative(0.816f, 5.991f)
                curveToRelative(0.137f, 1.001f, -0.166f, 2.012f, -0.831f, 2.774f)
                close()
                moveTo(10.03f, 16.432f)
                curveToRelative(-0.026f, 0.196f, 0.062f, 0.332f, 0.118f, 0.396f)
                reflectiveCurveToRelative(0.179f, 0.171f, 0.377f, 0.171f)
                horizontalLineToRelative(3.949f)
                curveToRelative(0.198f, 0.0f, 0.321f, -0.107f, 0.377f, -0.171f)
                reflectiveCurveToRelative(0.145f, -0.2f, 0.118f, -0.396f)
                lineToRelative(-0.816f, -5.99f)
                curveToRelative(-0.112f, -0.822f, -0.823f, -1.443f, -1.653f, -1.443f)
                reflectiveCurveToRelative(-1.541f, 0.621f, -1.653f, 1.444f)
                lineToRelative(-0.816f, 5.989f)
                close()
            }
        }
        .build()
        return _personDressSimple!!
    }

private var _personDressSimple: ImageVector? = null
