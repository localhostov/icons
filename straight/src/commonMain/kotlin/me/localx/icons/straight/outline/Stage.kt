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

public val Icons.Outline.Stage: ImageVector
    get() {
        if (_stage != null) {
            return _stage!!
        }
        _stage = Builder(name = "Stage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.414f, 22.0f)
                lineToRelative(-5.414f, -5.414f)
                lineTo(13.0f, 6.414f)
                lineToRelative(1.591f, -1.591f)
                curveToRelative(0.282f, 0.111f, 0.588f, 0.177f, 0.909f, 0.177f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.322f, 0.066f, 0.627f, 0.177f, 0.909f)
                lineToRelative(-4.884f, 4.884f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.293f, -1.293f)
                verticalLineToRelative(8.172f)
                lineToRelative(-5.414f, 5.414f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.586f)
                close()
                moveTo(12.0f, 18.414f)
                lineToRelative(3.586f, 3.586f)
                horizontalLineToRelative(-7.172f)
                lineToRelative(3.586f, -3.586f)
                close()
            }
        }
        .build()
        return _stage!!
    }

private var _stage: ImageVector? = null
