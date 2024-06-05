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

public val Icons.Filled.BoneBreak: ImageVector
    get() {
        if (_boneBreak != null) {
            return _boneBreak!!
        }
        _boneBreak = Builder(name = "BoneBreak", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.46f, 16.083f)
                curveToRelative(0.272f, 0.48f, 0.44f, 1.026f, 0.44f, 1.617f)
                curveToRelative(0.0f, 1.823f, -1.477f, 3.3f, -3.3f, 3.3f)
                reflectiveCurveToRelative(-3.3f, -1.477f, -3.3f, -3.3f)
                curveToRelative(0.0f, -0.317f, 0.052f, -0.619f, 0.136f, -0.909f)
                lineToRelative(-4.436f, -1.274f)
                lineToRelative(-4.436f, 1.274f)
                curveToRelative(0.084f, 0.289f, 0.136f, 0.592f, 0.136f, 0.909f)
                curveToRelative(0.0f, 1.823f, -1.477f, 3.3f, -3.3f, 3.3f)
                reflectiveCurveToRelative(-3.3f, -1.477f, -3.3f, -3.3f)
                curveToRelative(0.0f, -0.591f, 0.168f, -1.138f, 0.44f, -1.617f)
                curveToRelative(-0.923f, -0.585f, -1.54f, -1.609f, -1.54f, -2.783f)
                curveToRelative(0.0f, -1.823f, 1.477f, -3.3f, 3.3f, -3.3f)
                curveToRelative(1.536f, 0.0f, 2.815f, 1.054f, 3.183f, 2.474f)
                lineToRelative(4.065f, -1.229f)
                lineToRelative(1.44f, 3.351f)
                lineToRelative(1.138f, -3.333f)
                lineToRelative(4.377f, 1.257f)
                curveToRelative(0.352f, -1.444f, 1.645f, -2.52f, 3.197f, -2.52f)
                curveToRelative(1.823f, 0.0f, 3.3f, 1.477f, 3.3f, 3.3f)
                curveToRelative(0.0f, 1.174f, -0.617f, 2.198f, -1.54f, 2.783f)
                close()
                moveTo(13.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 2.0f)
                close()
                moveTo(18.866f, 4.036f)
                lineToRelative(-1.732f, -1.0f)
                lineToRelative(-2.0f, 3.464f)
                lineToRelative(1.732f, 1.0f)
                lineToRelative(2.0f, -3.464f)
                close()
                moveTo(8.866f, 6.5f)
                lineToRelative(-2.0f, -3.464f)
                lineToRelative(-1.732f, 1.0f)
                lineToRelative(2.0f, 3.464f)
                lineToRelative(1.732f, -1.0f)
                close()
            }
        }
        .build()
        return _boneBreak!!
    }

private var _boneBreak: ImageVector? = null
