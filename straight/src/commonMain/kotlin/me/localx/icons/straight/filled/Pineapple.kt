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

public val Icons.Filled.Pineapple: ImageVector
    get() {
        if (_pineapple != null) {
            return _pineapple!!
        }
        _pineapple = Builder(name = "Pineapple", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.034f)
                close()
                moveTo(13.0f, 6.034f)
                close()
                moveTo(13.449f, 10.766f)
                lineTo(16.649f, 13.966f)
                lineTo(20.288f, 10.327f)
                arcTo(6.055f, 6.055f, 0.0f, false, false, 17.212f, 7.0f)
                close()
                moveTo(8.776f, 15.439f)
                lineToRelative(3.2f, 3.2f)
                lineToRelative(3.259f, -3.259f)
                lineToRelative(-3.2f, -3.2f)
                close()
                moveTo(10.621f, 10.766f)
                lineTo(6.835f, 6.98f)
                arcTo(6.064f, 6.064f, 0.0f, false, false, 3.7f, 10.361f)
                lineToRelative(3.664f, 3.664f)
                close()
                moveTo(8.947f, 6.334f)
                lineTo(12.0f, 9.387f)
                lineToRelative(3.053f, -3.053f)
                curveTo(15.319f, 4.287f, 16.7f, 3.0f, 18.0f, 3.0f)
                lineTo(18.0f, 1.0f)
                arcToRelative(5.445f, 5.445f, 0.0f, false, false, -5.0f, 5.034f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.011f, 0.0f, -0.005f, 0.0f, 0.0f, 0.0f)
                lineTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 6.034f)
                horizontalLineToRelative(0.0f)
                arcTo(5.445f, 5.445f, 0.0f, false, false, 6.0f, 1.0f)
                lineTo(6.0f, 3.0f)
                curveTo(7.3f, 3.0f, 8.681f, 4.287f, 8.947f, 6.334f)
                close()
                moveTo(13.393f, 20.056f)
                lineTo(16.606f, 23.269f)
                arcTo(6.112f, 6.112f, 0.0f, false, false, 20.052f, 20.2f)
                lineToRelative(-3.4f, -3.4f)
                close()
                moveTo(20.857f, 12.591f)
                lineTo(18.066f, 15.383f)
                lineTo(20.747f, 18.064f)
                arcTo(16.419f, 16.419f, 0.0f, false, false, 21.0f, 15.0f)
                arcTo(18.152f, 18.152f, 0.0f, false, false, 20.857f, 12.591f)
                close()
                moveTo(9.619f, 23.83f)
                arcTo(16.191f, 16.191f, 0.0f, false, false, 12.0f, 24.0f)
                arcToRelative(16.315f, 16.315f, 0.0f, false, false, 2.344f, -0.165f)
                lineTo(11.979f, 21.47f)
                close()
                moveTo(7.362f, 16.853f)
                lineTo(3.971f, 20.245f)
                arcToRelative(6.109f, 6.109f, 0.0f, false, false, 3.391f, 3.013f)
                lineToRelative(3.2f, -3.2f)
                close()
                moveTo(3.139f, 12.629f)
                arcTo(18.275f, 18.275f, 0.0f, false, false, 3.0f, 15.0f)
                arcToRelative(16.289f, 16.289f, 0.0f, false, false, 0.263f, 3.124f)
                lineToRelative(2.685f, -2.685f)
                close()
            }
        }
        .build()
        return _pineapple!!
    }

private var _pineapple: ImageVector? = null
