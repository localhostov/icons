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

public val Icons.Filled.Aubergine: ImageVector
    get() {
        if (_aubergine != null) {
            return _aubergine!!
        }
        _aubergine = Builder(name = "Aubergine", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.21f, 3.933f)
                arcToRelative(17.325f, 17.325f, 0.0f, false, false, 4.162f, -1.0f)
                lineToRelative(-0.743f, -1.858f)
                arcTo(15.621f, 15.621f, 0.0f, false, true, 19.0f, 1.941f)
                verticalLineTo(0.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(1.941f)
                arcToRelative(15.621f, 15.621f, 0.0f, false, true, -3.629f, -0.87f)
                lineToRelative(-0.743f, 1.858f)
                arcTo(17.3f, 17.3f, 0.0f, false, false, 16.8f, 3.934f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, false, -3.763f, 4.207f)
                arcToRelative(2.525f, 2.525f, 0.0f, false, true, -0.568f, 1.323f)
                curveToRelative(-1.1f, 1.27f, -2.343f, 1.56f, -4.821f, 1.538f)
                lineTo(7.0f, 11.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 2.564f, -7.0f, 6.423f)
                reflectiveCurveTo(3.14f, 24.0f, 7.0f, 24.0f)
                curveToRelative(10.019f, 0.0f, 16.0f, -6.038f, 16.0f, -15.231f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 19.21f, 3.933f)
                close()
                moveTo(17.0f, 7.0f)
                verticalLineTo(3.955f)
                curveToRelative(0.329f, 0.028f, 0.664f, 0.045f, 1.0f, 0.045f)
                reflectiveCurveToRelative(0.671f, -0.017f, 1.0f, -0.045f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _aubergine!!
    }

private var _aubergine: ImageVector? = null
