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

public val Icons.Outline.PadlockCheck: ImageVector
    get() {
        if (_padlockCheck != null) {
            return _padlockCheck!!
        }
        _padlockCheck = Builder(name = "PadlockCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.518f, 22.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(9.349f)
                curveToRelative(1.545f, -1.249f, 3.51f, -2.0f, 5.651f, -2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveTo(3.0f, 3.14f, 3.0f, 7.0f)
                verticalLineToRelative(1.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(8.349f)
                curveToRelative(-0.706f, -0.571f, -1.325f, -1.244f, -1.831f, -2.0f)
                close()
                moveTo(5.0f, 7.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(20.992f, 16.118f)
                lineToRelative(-3.457f, 3.399f)
                curveToRelative(-0.308f, 0.309f, -0.727f, 0.482f, -1.172f, 0.482f)
                reflectiveCurveToRelative(-0.864f, -0.173f, -1.179f, -0.488f)
                lineToRelative(-1.846f, -1.789f)
                lineToRelative(1.393f, -1.436f)
                lineToRelative(1.63f, 1.58f)
                lineToRelative(3.229f, -3.175f)
                lineToRelative(1.402f, 1.426f)
                close()
                moveTo(17.0f, 10.0f)
                curveToRelative(-2.785f, 0.0f, -5.189f, 1.639f, -6.315f, 4.0f)
                horizontalLineToRelative(-1.685f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.08f)
                curveToRelative(0.488f, 3.386f, 3.401f, 6.0f, 6.92f, 6.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _padlockCheck!!
    }

private var _padlockCheck: ImageVector? = null
