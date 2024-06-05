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

public val Icons.Outline.PointerLoading: ImageVector
    get() {
        if (_pointerLoading != null) {
            return _pointerLoading!!
        }
        _pointerLoading = Builder(name = "PointerLoading", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.624f, 2.74f)
                curveToRelative(-0.603f, -0.793f, -1.756f, -0.978f, -2.569f, -0.359f)
                lineTo(9.044f, 12.752f)
                lineToRelative(5.32f, 0.564f)
                lineToRelative(-2.53f, 4.987f)
                lineToRelative(5.449f, 2.726f)
                lineToRelative(2.655f, -5.165f)
                lineToRelative(4.062f, 3.712f)
                lineTo(24.0f, 3.855f)
                curveToRelative(0.0f, -0.399f, -0.133f, -0.795f, -0.376f, -1.115f)
                close()
                moveTo(22.0f, 15.039f)
                lineToRelative(-2.644f, -2.415f)
                lineToRelative(-2.948f, 5.731f)
                lineToRelative(-1.881f, -0.94f)
                lineToRelative(2.933f, -5.78f)
                lineToRelative(-3.617f, -0.385f)
                lineToRelative(8.157f, -7.046f)
                lineTo(22.0f, 15.039f)
                close()
                moveTo(3.0f, 20.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(7.0f, 20.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(11.0f, 20.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _pointerLoading!!
    }

private var _pointerLoading: ImageVector? = null
