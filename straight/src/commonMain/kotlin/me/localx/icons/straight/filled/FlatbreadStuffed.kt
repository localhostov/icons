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

public val Icons.Filled.FlatbreadStuffed: ImageVector
    get() {
        if (_flatbreadStuffed != null) {
            return _flatbreadStuffed!!
        }
        _flatbreadStuffed = Builder(name = "FlatbreadStuffed", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 3.516f)
                lineTo(3.586f, 20.484f)
                curveToRelative(2.258f, 2.268f, 5.262f, 3.516f, 8.457f, 3.516f)
                reflectiveCurveToRelative(6.198f, -1.248f, 8.457f, -3.516f)
                curveToRelative(4.658f, -4.679f, 4.658f, -12.29f, 0.0f, -16.968f)
                close()
                moveTo(13.207f, 19.207f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-6.0f, 6.0f)
                close()
                moveTo(9.553f, 11.5f)
                curveToRelative(-0.874f, -1.387f, -0.708f, -3.241f, 0.5f, -4.449f)
                reflectiveCurveToRelative(3.054f, -1.373f, 4.44f, -0.506f)
                lineToRelative(-4.939f, 4.955f)
                close()
                moveTo(4.0f, 12.508f)
                reflectiveCurveToRelative(0.353f, 1.39f, 1.678f, 3.044f)
                lineToRelative(-3.126f, 3.136f)
                curveToRelative(-0.455f, -0.325f, -0.875f, -0.665f, -1.235f, -1.026f)
                curveToRelative(-1.589f, -1.597f, -1.737f, -4.099f, -0.446f, -5.864f)
                curveToRelative(-0.578f, -1.436f, -0.264f, -3.125f, 0.859f, -4.253f)
                curveToRelative(0.227f, -0.227f, 0.479f, -0.423f, 0.756f, -0.587f)
                curveToRelative(0.013f, -1.173f, 0.477f, -2.309f, 1.31f, -3.144f)
                curveToRelative(0.831f, -0.835f, 1.963f, -1.302f, 3.133f, -1.315f)
                curveToRelative(0.163f, -0.277f, 0.357f, -0.531f, 0.583f, -0.757f)
                curveToRelative(1.129f, -1.132f, 2.818f, -1.448f, 4.251f, -0.863f)
                curveToRelative(0.785f, -0.579f, 1.696f, -0.876f, 2.653f, -0.876f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.203f, 0.0f, 2.335f, 0.471f, 3.185f, 1.325f)
                curveToRelative(0.361f, 0.362f, 0.699f, 0.783f, 1.023f, 1.24f)
                lineToRelative(-2.657f, 2.666f)
                curveToRelative(-0.946f, -0.769f, -2.153f, -1.231f, -3.467f, -1.231f)
                curveToRelative(-3.038f, 0.0f, -5.5f, 2.462f, -5.5f, 5.5f)
                curveToRelative(0.0f, 0.874f, 0.204f, 1.7f, 0.567f, 2.434f)
                curveToRelative(-1.992f, -0.048f, -3.567f, 0.574f, -3.567f, 0.574f)
                close()
            }
        }
        .build()
        return _flatbreadStuffed!!
    }

private var _flatbreadStuffed: ImageVector? = null
