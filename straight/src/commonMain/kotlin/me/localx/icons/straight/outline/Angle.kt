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

public val Icons.Outline.Angle: ImageVector
    get() {
        if (_angle != null) {
            return _angle!!
        }
        _angle = Builder(name = "Angle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.998f, 10.375f)
                lineToRelative(1.522f, -1.299f)
                curveToRelative(0.941f, 1.333f, 1.705f, 2.792f, 2.281f, 4.346f)
                lineToRelative(-1.876f, 0.686f)
                curveToRelative(-0.493f, -1.329f, -1.135f, -2.584f, -1.928f, -3.733f)
                close()
                moveTo(15.759f, 8.803f)
                lineToRelative(1.52f, -1.296f)
                curveToRelative(-1.083f, -1.236f, -2.311f, -2.343f, -3.677f, -3.266f)
                lineToRelative(-0.964f, 1.771f)
                curveToRelative(1.154f, 0.798f, 2.198f, 1.74f, 3.121f, 2.792f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.612f, -0.224f, -3.169f, -0.603f, -4.665f)
                lineToRelative(-1.885f, 0.69f)
                curveToRelative(0.308f, 1.278f, 0.489f, 2.604f, 0.489f, 3.976f)
                close()
                moveTo(2.531f, 22.0f)
                curveToRelative(-0.269f, 0.0f, -0.404f, -0.179f, -0.449f, -0.256f)
                curveToRelative(-0.046f, -0.077f, -0.138f, -0.28f, -0.009f, -0.516f)
                lineTo(13.073f, 1.031f)
                lineToRelative(-1.757f, -0.957f)
                lineTo(0.316f, 20.271f)
                curveToRelative(-0.43f, 0.789f, -0.413f, 1.721f, 0.046f, 2.494f)
                curveToRelative(0.459f, 0.772f, 1.27f, 1.234f, 2.169f, 1.234f)
                horizontalLineToRelative(21.469f)
                verticalLineToRelative(-2.0f)
                lineTo(2.531f, 21.999f)
                close()
            }
        }
        .build()
        return _angle!!
    }

private var _angle: ImageVector? = null
