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

public val Icons.Filled.CallDuration: ImageVector
    get() {
        if (_callDuration != null) {
            return _callDuration!!
        }
        _callDuration = Builder(name = "CallDuration", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 0.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(21.309f, 0.0f, 18.0f, 0.0f)
                close()
                moveTo(19.079f, 8.441f)
                lineToRelative(-2.079f, -2.019f)
                verticalLineToRelative(-3.423f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.577f)
                lineToRelative(1.473f, 1.43f)
                lineToRelative(-1.394f, 1.435f)
                close()
                moveTo(17.231f, 13.229f)
                lineToRelative(6.265f, 6.266f)
                lineToRelative(-2.767f, 2.767f)
                curveToRelative(-1.105f, 1.106f, -2.6f, 1.716f, -4.207f, 1.716f)
                curveTo(9.274f, 23.979f, 0.022f, 14.727f, 0.022f, 7.479f)
                curveTo(0.022f, 5.87f, 0.631f, 4.376f, 1.738f, 3.271f)
                lineTo(4.505f, 0.504f)
                lineToRelative(6.265f, 6.265f)
                lineToRelative(-3.721f, 3.722f)
                curveToRelative(1.373f, 3.061f, 3.493f, 5.186f, 6.453f, 6.468f)
                lineToRelative(3.73f, -3.729f)
                close()
            }
        }
        .build()
        return _callDuration!!
    }

private var _callDuration: ImageVector? = null
