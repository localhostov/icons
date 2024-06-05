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

public val Icons.Bold.ChartPyramid: ImageVector
    get() {
        if (_chartPyramid != null) {
            return _chartPyramid!!
        }
        _chartPyramid = Builder(name = "ChartPyramid", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(501.313f, 377.013f)
                lineTo(339.687f, 51.845f)
                curveTo(316.735f, 5.632f, 260.666f, -13.225f, 214.452f, 9.727f)
                curveToRelative(-18.259f, 9.068f, -33.05f, 23.86f, -42.119f, 42.119f)
                lineTo(10.708f, 377.013f)
                curveToRelative(-22.966f, 46.22f, -4.114f, 102.305f, 42.105f, 125.271f)
                curveToRelative(12.924f, 6.422f, 27.161f, 9.763f, 41.593f, 9.761f)
                horizontalLineToRelative(323.209f)
                curveToRelative(51.611f, 0.005f, 93.454f, -41.829f, 93.459f, -93.44f)
                curveTo(511.076f, 404.174f, 507.734f, 389.938f, 501.313f, 377.013f)
                close()
                moveTo(396.536f, 309.774f)
                horizontalLineTo(115.485f)
                lineToRelative(42.328f, -85.167f)
                horizontalLineTo(354.25f)
                lineTo(396.536f, 309.774f)
                close()
                moveTo(256.01f, 63.854f)
                curveToRelative(11.264f, -0.124f, 21.586f, 6.273f, 26.487f, 16.416f)
                lineToRelative(39.986f, 80.462f)
                horizontalLineTo(189.537f)
                lineToRelative(39.986f, -80.462f)
                curveTo(234.433f, 70.135f, 244.749f, 63.741f, 256.01f, 63.854f)
                close()
                moveTo(442.76f, 434.16f)
                curveToRelative(-5.337f, 8.765f, -14.884f, 14.085f, -25.146f, 14.01f)
                horizontalLineTo(94.406f)
                curveToRelative(-16.333f, 0.001f, -29.575f, -13.24f, -29.575f, -29.573f)
                curveToRelative(0.0f, -4.566f, 1.057f, -9.07f, 3.088f, -13.159f)
                lineToRelative(15.798f, -31.789f)
                horizontalLineToRelative(344.586f)
                lineToRelative(15.798f, 31.789f)
                curveTo(448.749f, 414.579f, 448.24f, 425.492f, 442.76f, 434.16f)
                lineTo(442.76f, 434.16f)
                close()
            }
        }
        .build()
        return _chartPyramid!!
    }

private var _chartPyramid: ImageVector? = null
