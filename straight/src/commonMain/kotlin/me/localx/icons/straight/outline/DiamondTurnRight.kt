package me.localx.icons.straight.outline

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

public val Icons.Outline.DiamondTurnRight: ImageVector
    get() {
        if (_diamondTurnRight != null) {
            return _diamondTurnRight!!
        }
        _diamondTurnRight = Builder(name = "DiamondTurnRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.115f, 8.884f)
                lineTo(14.121f, 0.89f)
                curveToRelative(-1.17f, -1.17f, -3.072f, -1.17f, -4.242f, 0.0f)
                lineTo(1.885f, 8.884f)
                curveToRelative(-0.566f, 0.566f, -0.879f, 1.32f, -0.879f, 2.121f)
                reflectiveCurveToRelative(0.312f, 1.556f, 0.879f, 2.121f)
                lineToRelative(10.115f, 10.116f)
                lineToRelative(10.115f, -10.115f)
                curveToRelative(0.566f, -0.566f, 0.879f, -1.32f, 0.879f, -2.122f)
                reflectiveCurveToRelative(-0.312f, -1.555f, -0.879f, -2.121f)
                close()
                moveTo(20.701f, 11.712f)
                lineToRelative(-8.701f, 8.702f)
                lineTo(3.299f, 11.711f)
                curveToRelative(-0.189f, -0.188f, -0.293f, -0.438f, -0.293f, -0.706f)
                reflectiveCurveToRelative(0.104f, -0.518f, 0.293f, -0.707f)
                lineTo(11.293f, 2.304f)
                curveToRelative(0.195f, -0.195f, 0.451f, -0.292f, 0.707f, -0.292f)
                reflectiveCurveToRelative(0.512f, 0.097f, 0.707f, 0.292f)
                lineToRelative(7.994f, 7.994f)
                curveToRelative(0.188f, 0.189f, 0.293f, 0.44f, 0.293f, 0.707f)
                reflectiveCurveToRelative(-0.104f, 0.518f, -0.293f, 0.707f)
                close()
                moveTo(16.465f, 8.709f)
                curveToRelative(0.345f, 0.344f, 0.535f, 0.803f, 0.535f, 1.291f)
                reflectiveCurveToRelative(-0.19f, 0.947f, -0.536f, 1.292f)
                lineToRelative(-2.757f, 2.758f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.635f, -1.636f)
                horizontalLineToRelative(-2.928f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.586f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(-1.585f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.928f)
                lineToRelative(-1.635f, -1.636f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.758f, 2.759f)
                close()
            }
        }
        .build()
        return _diamondTurnRight!!
    }

private var _diamondTurnRight: ImageVector? = null
