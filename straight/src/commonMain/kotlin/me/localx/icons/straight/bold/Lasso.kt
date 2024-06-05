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

public val Icons.Bold.Lasso: ImageVector
    get() {
        if (_lasso != null) {
            return _lasso!!
        }
        _lasso = Builder(name = "Lasso", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 0.0f)
                curveToRelative(-6.271f, 0.0f, -11.0f, 4.084f, -11.0f, 9.5f)
                arcToRelative(8.737f, 8.737f, 0.0f, false, false, 0.168f, 1.668f)
                arcToRelative(3.985f, 3.985f, 0.0f, false, false, -0.853f, 4.368f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, -1.315f, 3.964f)
                arcToRelative(4.373f, 4.373f, 0.0f, false, false, 4.5f, 4.5f)
                lineToRelative(0.018f, -3.0f)
                arcToRelative(1.378f, 1.378f, 0.0f, false, true, -1.518f, -1.5f)
                arcToRelative(3.649f, 3.649f, 0.0f, false, true, 0.565f, -1.95f)
                arcToRelative(14.443f, 14.443f, 0.0f, false, false, 4.033f, 0.463f)
                curveToRelative(0.134f, 0.0f, 0.259f, -0.009f, 0.393f, -0.011f)
                arcToRelative(12.765f, 12.765f, 0.0f, false, false, 5.009f, 0.998f)
                curveToRelative(6.271f, 0.0f, 11.0f, -4.084f, 11.0f, -9.5f)
                reflectiveCurveToRelative(-4.729f, -9.5f, -11.0f, -9.5f)
                close()
                moveTo(13.0f, 16.0f)
                arcToRelative(10.253f, 10.253f, 0.0f, false, true, -2.581f, -0.324f)
                arcToRelative(18.874f, 18.874f, 0.0f, false, false, -2.613f, -4.508f)
                arcToRelative(3.969f, 3.969f, 0.0f, false, false, -2.777f, -1.126f)
                curveToRelative(-0.017f, -0.179f, -0.029f, -0.36f, -0.029f, -0.542f)
                curveToRelative(0.0f, -3.706f, 3.439f, -6.5f, 8.0f, -6.5f)
                reflectiveCurveToRelative(8.0f, 2.794f, 8.0f, 6.5f)
                reflectiveCurveToRelative(-3.439f, 6.5f, -8.0f, 6.5f)
                close()
            }
        }
        .build()
        return _lasso!!
    }

private var _lasso: ImageVector? = null
