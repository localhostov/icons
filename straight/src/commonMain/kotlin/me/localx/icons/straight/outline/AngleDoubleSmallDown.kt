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

public val Icons.Outline.AngleDoubleSmallDown: ImageVector
    get() {
        if (_angleDoubleSmallDown != null) {
            return _angleDoubleSmallDown!!
        }
        _angleDoubleSmallDown = Builder(name = "AngleDoubleSmallDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                curveToRelative(-0.534f, 0.0f, -1.036f, -0.208f, -1.414f, -0.586f)
                lineToRelative(-5.281f, -5.281f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(5.281f, 5.281f)
                lineToRelative(5.281f, -5.281f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-5.281f, 5.281f)
                curveToRelative(-0.378f, 0.378f, -0.88f, 0.586f, -1.414f, 0.586f)
                close()
                moveTo(12.825f, 12.999f)
                lineToRelative(5.871f, -5.871f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-5.281f, 5.282f)
                lineTo(6.719f, 5.714f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(5.873f, 5.874f)
                curveToRelative(0.227f, 0.225f, 0.523f, 0.337f, 0.821f, 0.337f)
                reflectiveCurveToRelative(0.598f, -0.113f, 0.826f, -0.34f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallDown!!
    }

private var _angleDoubleSmallDown: ImageVector? = null
