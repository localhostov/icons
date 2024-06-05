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

public val Icons.Filled.AnglesUpDown: ImageVector
    get() {
        if (_anglesUpDown != null) {
            return _anglesUpDown!!
        }
        _anglesUpDown = Builder(name = "AnglesUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 10.0f)
                curveToRelative(-0.258f, 0.0f, -0.515f, -0.099f, -0.711f, -0.296f)
                lineToRelative(-7.177f, -7.245f)
                curveToRelative(-0.588f, -0.589f, -1.633f, -0.593f, -2.229f, 0.004f)
                lineToRelative(-7.173f, 7.241f)
                curveToRelative(-0.39f, 0.392f, -1.021f, 0.396f, -1.415f, 0.007f)
                curveToRelative(-0.392f, -0.389f, -0.395f, -1.022f, -0.007f, -1.414f)
                lineTo(9.467f, 1.051f)
                curveToRelative(1.359f, -1.358f, 3.71f, -1.354f, 5.063f, -0.004f)
                lineToRelative(7.181f, 7.249f)
                curveToRelative(0.388f, 0.392f, 0.385f, 1.025f, -0.007f, 1.414f)
                curveToRelative(-0.195f, 0.193f, -0.45f, 0.29f, -0.704f, 0.29f)
                close()
                moveTo(14.533f, 22.949f)
                lineToRelative(7.178f, -7.245f)
                curveToRelative(0.388f, -0.393f, 0.385f, -1.026f, -0.007f, -1.415f)
                curveToRelative(-0.394f, -0.388f, -1.025f, -0.385f, -1.415f, 0.007f)
                lineToRelative(-7.172f, 7.241f)
                curveToRelative(-0.598f, 0.598f, -1.642f, 0.594f, -2.229f, 0.004f)
                lineToRelative(-7.177f, -7.245f)
                curveToRelative(-0.39f, -0.392f, -1.021f, -0.395f, -1.415f, -0.007f)
                curveToRelative(-0.392f, 0.389f, -0.395f, 1.022f, -0.007f, 1.415f)
                lineToRelative(7.182f, 7.249f)
                curveToRelative(0.676f, 0.675f, 1.574f, 1.047f, 2.529f, 1.047f)
                reflectiveCurveToRelative(1.854f, -0.372f, 2.533f, -1.051f)
                close()
            }
        }
        .build()
        return _anglesUpDown!!
    }

private var _anglesUpDown: ImageVector? = null
