package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.954f, 5.9541f)
                    curveTo(15.261f, 5.9541f, 13.228f, 7.7921f, 12.0f, 9.3181f)
                    curveTo(10.772f, 7.7921f, 8.739f, 5.9541f, 6.046f, 5.9541f)
                    curveTo(4.4425f, 5.9541f, 2.9047f, 6.5911f, 1.7708f, 7.7249f)
                    curveTo(0.637f, 8.8588f, 0.0f, 10.3966f, 0.0f, 12.0001f)
                    curveTo(0.0f, 13.6036f, 0.637f, 15.1414f, 1.7708f, 16.2753f)
                    curveTo(2.9047f, 17.4091f, 4.4425f, 18.0461f, 6.046f, 18.0461f)
                    curveTo(8.739f, 18.0461f, 10.772f, 16.2081f, 12.0f, 14.6821f)
                    curveTo(13.228f, 16.2081f, 15.261f, 18.0461f, 17.954f, 18.0461f)
                    curveTo(19.5575f, 18.0461f, 21.0953f, 17.4091f, 22.2292f, 16.2753f)
                    curveTo(23.363f, 15.1414f, 24.0f, 13.6036f, 24.0f, 12.0001f)
                    curveTo(24.0f, 10.3966f, 23.363f, 8.8588f, 22.2292f, 7.7249f)
                    curveTo(21.0953f, 6.5911f, 19.5575f, 5.9541f, 17.954f, 5.9541f)
                    close()
                    moveTo(6.046f, 15.0461f)
                    curveTo(5.2382f, 15.0461f, 4.4634f, 14.7252f, 3.8921f, 14.1539f)
                    curveTo(3.3209f, 13.5827f, 3.0f, 12.808f, 3.0f, 12.0001f)
                    curveTo(3.0f, 11.1923f, 3.3209f, 10.4175f, 3.8921f, 9.8462f)
                    curveTo(4.4634f, 9.275f, 5.2382f, 8.9541f, 6.046f, 8.9541f)
                    curveTo(7.862f, 8.9541f, 9.453f, 10.7751f, 10.259f, 12.0001f)
                    curveTo(9.453f, 13.2251f, 7.862f, 15.0461f, 6.046f, 15.0461f)
                    close()
                    moveTo(17.954f, 15.0461f)
                    curveTo(16.138f, 15.0461f, 14.547f, 13.2251f, 13.741f, 12.0001f)
                    curveTo(14.547f, 10.7751f, 16.141f, 8.9541f, 17.954f, 8.9541f)
                    curveTo(18.7619f, 8.9541f, 19.5366f, 9.275f, 20.1078f, 9.8462f)
                    curveTo(20.6791f, 10.4175f, 21.0f, 11.1923f, 21.0f, 12.0001f)
                    curveTo(21.0f, 12.808f, 20.6791f, 13.5827f, 20.1078f, 14.1539f)
                    curveTo(19.5366f, 14.7252f, 18.7619f, 15.0461f, 17.954f, 15.0461f)
                    close()
                }
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
