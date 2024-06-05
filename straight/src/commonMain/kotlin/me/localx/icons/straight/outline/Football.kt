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

public val Icons.Outline.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -12.0f, -12.0f)
                close()
                moveTo(20.227f, 6.329f)
                arcToRelative(9.932f, 9.932f, 0.0f, false, true, 1.746f, 5.131f)
                lineToRelative(-2.736f, -1.927f)
                close()
                moveTo(14.711f, 2.384f)
                lineTo(12.0f, 4.354f)
                lineTo(9.289f, 2.384f)
                arcToRelative(9.762f, 9.762f, 0.0f, false, true, 5.422f, 0.0f)
                close()
                moveTo(14.5f, 11.056f)
                lineTo(13.548f, 14.0f)
                horizontalLineToRelative(-3.1f)
                lineToRelative(-0.948f, -2.944f)
                lineToRelative(2.5f, -1.82f)
                close()
                moveTo(4.763f, 9.533f)
                lineTo(2.027f, 11.46f)
                arcToRelative(9.94f, 9.94f, 0.0f, false, true, 1.745f, -5.131f)
                close()
                moveTo(4.007f, 17.985f)
                lineTo(7.482f, 18.0f)
                lineTo(8.567f, 21.38f)
                arcToRelative(10.034f, 10.034f, 0.0f, false, true, -4.56f, -3.395f)
                close()
                moveTo(10.843f, 21.927f)
                lineTo(8.942f, 16.0f)
                lineTo(2.831f, 15.982f)
                arcToRelative(9.914f, 9.914f, 0.0f, false, true, -0.659f, -2.176f)
                lineToRelative(4.928f, -3.475f)
                lineToRelative(-1.776f, -5.755f)
                arcToRelative(10.04f, 10.04f, 0.0f, false, true, 1.8f, -1.3f)
                lineToRelative(4.833f, 3.524f)
                lineToRelative(-4.813f, 3.5f)
                lineToRelative(1.856f, 5.7f)
                horizontalLineToRelative(6.0f)
                lineToRelative(1.855f, -5.708f)
                lineToRelative(-4.812f, -3.492f)
                lineToRelative(4.837f, -3.52f)
                arcToRelative(10.04f, 10.04f, 0.0f, false, true, 1.8f, 1.3f)
                lineToRelative(-1.78f, 5.751f)
                lineToRelative(4.931f, 3.474f)
                arcToRelative(9.9f, 9.9f, 0.0f, false, true, -0.659f, 2.175f)
                lineToRelative(-6.114f, 0.02f)
                lineToRelative(-1.9f, 5.927f)
                arcToRelative(9.205f, 9.205f, 0.0f, false, true, -2.314f, 0.0f)
                close()
                moveTo(15.432f, 21.38f)
                lineTo(16.518f, 18.0f)
                lineTo(19.993f, 17.989f)
                arcToRelative(10.021f, 10.021f, 0.0f, false, true, -4.561f, 3.391f)
                close()
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
