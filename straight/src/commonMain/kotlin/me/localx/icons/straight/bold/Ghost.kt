package me.localx.icons.straight.bold

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

public val Icons.Bold.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(6.486f, 0.0f, 2.0f, 4.486f, 2.0f, 10.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(2.592f)
                curveToRelative(0.207f, -0.581f, 0.757f, -1.0f, 1.408f, -1.0f)
                reflectiveCurveToRelative(1.201f, 0.419f, 1.408f, 1.0f)
                horizontalLineToRelative(3.184f)
                curveToRelative(0.207f, -0.581f, 0.757f, -1.0f, 1.408f, -1.0f)
                reflectiveCurveToRelative(1.201f, 0.419f, 1.408f, 1.0f)
                horizontalLineToRelative(3.184f)
                curveToRelative(0.207f, -0.581f, 0.757f, -1.0f, 1.408f, -1.0f)
                reflectiveCurveToRelative(1.201f, 0.419f, 1.408f, 1.0f)
                horizontalLineToRelative(2.592f)
                verticalLineToRelative(-14.0f)
                curveTo(22.0f, 4.486f, 17.514f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(15.0f, 21.17f)
                curveToRelative(-0.798f, -0.72f, -1.843f, -1.17f, -3.0f, -1.17f)
                reflectiveCurveToRelative(-2.202f, 0.451f, -3.0f, 1.17f)
                curveToRelative(-0.798f, -0.72f, -1.843f, -1.17f, -3.0f, -1.17f)
                curveToRelative(-0.344f, 0.0f, -0.679f, 0.04f, -1.0f, 0.115f)
                verticalLineToRelative(-10.115f)
                curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                verticalLineToRelative(10.115f)
                curveToRelative(-0.321f, -0.075f, -0.656f, -0.115f, -1.0f, -0.115f)
                curveToRelative(-1.157f, 0.0f, -2.202f, 0.451f, -3.0f, 1.17f)
                close()
                moveTo(10.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(17.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
