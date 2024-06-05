package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.SortDown: ImageVector
    get() {
        if (_sortDown != null) {
            return _sortDown!!
        }
        _sortDown = Builder(name = "SortDown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.558f, 18.0f)
                curveToRelative(-0.854f, 0.0f, -1.676f, -0.351f, -2.254f, -0.961f)
                lineTo(3.295f, 11.256f)
                curveToRelative(-0.741f, -0.767f, -0.934f, -1.792f, -0.541f, -2.715f)
                curveToRelative(0.397f, -0.937f, 1.323f, -1.541f, 2.359f, -1.541f)
                horizontalLineToRelative(12.887f)
                curveToRelative(1.036f, 0.0f, 1.962f, 0.604f, 2.359f, 1.541f)
                curveToRelative(0.393f, 0.923f, 0.2f, 1.948f, -0.502f, 2.676f)
                lineToRelative(-6.097f, 5.871f)
                curveToRelative(-0.528f, 0.562f, -1.35f, 0.912f, -2.203f, 0.912f)
                close()
                moveTo(6.314f, 10.0f)
                lineToRelative(5.243f, 5.0f)
                curveToRelative(0.016f, -0.017f, 5.239f, -5.0f, 5.239f, -5.0f)
                horizontalLineTo(6.314f)
                close()
            }
        }
        .build()
        return _sortDown!!
    }

private var _sortDown: ImageVector? = null
