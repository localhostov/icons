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

public val Icons.Bold.GrinSquintTears: ImageVector
    get() {
        if (_grinSquintTears != null) {
            return _grinSquintTears!!
        }
        _grinSquintTears = Builder(name = "GrinSquintTears", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.167f, 17.662f)
                arcToRelative(21.9f, 21.9f, 0.0f, false, false, 4.95f, -3.536f)
                arcToRelative(21.962f, 21.962f, 0.0f, false, false, 3.54f, -4.954f)
                curveToRelative(1.178f, 2.047f, 1.649f, 5.416f, -0.707f, 7.778f)
                reflectiveCurveTo(11.214f, 18.839f, 9.167f, 17.662f)
                close()
                moveTo(10.623f, 9.377f)
                curveToRelative(1.6f, 1.6f, 4.5f, -0.26f, 5.657f, -1.414f)
                curveToRelative(0.0f, 0.0f, -2.829f, 0.0f, -3.536f, -0.707f)
                reflectiveCurveToRelative(-0.707f, -3.536f, -0.707f, -3.536f)
                curveTo(10.883f, 4.874f, 9.02f, 7.774f, 10.623f, 9.377f)
                close()
                moveTo(9.377f, 10.623f)
                curveToRelative(-1.6f, -1.6f, -4.5f, 0.26f, -5.657f, 1.414f)
                curveToRelative(3.794f, 0.107f, 4.133f, 0.47f, 4.243f, 4.243f)
                curveTo(9.117f, 15.126f, 10.98f, 12.225f, 9.377f, 10.623f)
                close()
                moveTo(22.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                curveTo(20.9f, 6.0f, 17.54f, 8.0f, 17.54f, 8.0f)
                reflectiveCurveTo(20.9f, 10.0f, 22.0f, 10.0f)
                close()
                moveTo(6.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                curveToRelative(0.0f, -1.105f, -2.0f, -4.46f, -2.0f, -4.46f)
                reflectiveCurveTo(6.0f, 20.9f, 6.0f, 22.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcTo(8.959f, 8.959f, 0.0f, false, true, 18.093f, 5.4f)
                arcTo(14.818f, 14.818f, 0.0f, false, true, 21.055f, 4.15f)
                arcTo(11.965f, 11.965f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(0.952f, -0.057f, -4.177f, 14.0f, 4.15f, 21.055f)
                arcTo(14.818f, 14.818f, 0.0f, false, true, 5.4f, 18.093f)
                curveTo(0.08f, 12.554f, 4.252f, 2.893f, 12.0f, 3.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(4.028f, 4.028f, 0.0f, false, true, -1.008f, -0.166f)
                arcToRelative(8.99f, 8.99f, 0.0f, false, true, -9.158f, 9.158f)
                arcToRelative(3.691f, 3.691f, 0.0f, false, true, -0.376f, 2.981f)
                arcTo(11.977f, 11.977f, 0.0f, false, false, 23.973f, 11.458f)
                arcTo(3.953f, 3.953f, 0.0f, false, true, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _grinSquintTears!!
    }

private var _grinSquintTears: ImageVector? = null
