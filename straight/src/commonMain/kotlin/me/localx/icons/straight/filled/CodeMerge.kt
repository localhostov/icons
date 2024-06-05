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

public val Icons.Filled.CodeMerge: ImageVector
    get() {
        if (_codeMerge != null) {
            return _codeMerge!!
        }
        _codeMerge = Builder(name = "CodeMerge", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                curveToRelative(-1.859f, 0.0f, -3.411f, 1.28f, -3.858f, 3.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-2.142f)
                curveToRelative(1.721f, -0.447f, 3.0f, -2.0f, 3.0f, -3.858f)
                curveTo(8.0f, 1.794f, 6.206f, 0.0f, 4.0f, 0.0f)
                reflectiveCurveTo(0.0f, 1.794f, 0.0f, 4.0f)
                curveToRelative(0.0f, 1.858f, 1.279f, 3.411f, 3.0f, 3.858f)
                verticalLineToRelative(8.284f)
                curveToRelative(-1.721f, 0.447f, -3.0f, 2.0f, -3.0f, 3.858f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.858f, -1.279f, -3.411f, -3.0f, -3.858f)
                verticalLineToRelative(-3.313f)
                curveToRelative(0.312f, 0.111f, 0.649f, 0.171f, 1.0f, 0.171f)
                horizontalLineToRelative(10.142f)
                curveToRelative(0.447f, 1.72f, 1.999f, 3.0f, 3.858f, 3.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _codeMerge!!
    }

private var _codeMerge: ImageVector? = null
