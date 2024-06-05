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

public val Icons.Filled.ObjectUngroup: ImageVector
    get() {
        if (_objectUngroup != null) {
            return _objectUngroup!!
        }
        _objectUngroup = Builder(name = "ObjectUngroup", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.172f, 13.0f)
                curveToRelative(0.413f, 1.164f, 1.524f, 2.0f, 2.828f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.304f, -0.836f, -2.415f, -2.0f, -2.828f)
                verticalLineToRelative(-3.344f)
                curveToRelative(1.164f, -0.413f, 2.0f, -1.524f, 2.0f, -2.828f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-1.304f, 0.0f, -2.415f, 0.836f, -2.828f, 2.0f)
                horizontalLineToRelative(-4.344f)
                curveToRelative(-0.413f, -1.164f, -1.524f, -2.0f, -2.828f, -2.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                curveToRelative(0.0f, 1.304f, 0.836f, 2.415f, 2.0f, 2.828f)
                verticalLineToRelative(3.344f)
                curveToRelative(-1.164f, 0.413f, -2.0f, 1.524f, -2.0f, 2.828f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.304f, 0.0f, 2.415f, -0.836f, 2.828f, -2.0f)
                horizontalLineToRelative(4.344f)
                close()
                moveTo(4.0f, 9.172f)
                verticalLineToRelative(-3.344f)
                curveToRelative(0.851f, -0.302f, 1.526f, -0.977f, 1.828f, -1.828f)
                horizontalLineToRelative(4.344f)
                curveToRelative(0.302f, 0.851f, 0.977f, 1.526f, 1.828f, 1.828f)
                verticalLineToRelative(3.344f)
                curveToRelative(-0.851f, 0.302f, -1.526f, 0.977f, -1.828f, 1.828f)
                horizontalLineToRelative(-4.344f)
                curveToRelative(-0.302f, -0.851f, -0.977f, -1.526f, -1.828f, -1.828f)
                close()
                moveTo(22.0f, 18.172f)
                verticalLineToRelative(-3.344f)
                curveToRelative(1.343f, -0.476f, 2.249f, -1.883f, 1.939f, -3.441f)
                curveToRelative(-0.234f, -1.172f, -1.203f, -2.122f, -2.379f, -2.336f)
                curveToRelative(-1.899f, -0.346f, -3.56f, 1.111f, -3.56f, 2.949f)
                curveToRelative(0.0f, 1.304f, 0.836f, 2.415f, 2.0f, 2.828f)
                verticalLineToRelative(3.344f)
                curveToRelative(-0.851f, 0.302f, -1.526f, 0.977f, -1.828f, 1.828f)
                horizontalLineToRelative(-4.344f)
                curveToRelative(-0.302f, -0.851f, -0.977f, -1.526f, -1.828f, -1.828f)
                verticalLineToRelative(-1.672f)
                reflectiveCurveToRelative(-2.0f, 0.0f, -2.0f, 0.0f)
                verticalLineToRelative(1.672f)
                curveToRelative(-1.343f, 0.476f, -2.249f, 1.883f, -1.939f, 3.441f)
                curveToRelative(0.23f, 1.154f, 1.172f, 2.096f, 2.326f, 2.326f)
                curveToRelative(1.559f, 0.311f, 2.965f, -0.596f, 3.441f, -1.939f)
                horizontalLineToRelative(4.344f)
                curveToRelative(0.476f, 1.343f, 1.883f, 2.249f, 3.441f, 1.939f)
                curveToRelative(1.154f, -0.23f, 2.096f, -1.172f, 2.326f, -2.326f)
                curveToRelative(0.311f, -1.559f, -0.596f, -2.965f, -1.939f, -3.441f)
                close()
            }
        }
        .build()
        return _objectUngroup!!
    }

private var _objectUngroup: ImageVector? = null
